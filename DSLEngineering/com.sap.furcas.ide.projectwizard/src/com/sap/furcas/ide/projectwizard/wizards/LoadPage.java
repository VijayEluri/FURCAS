package com.sap.furcas.ide.projectwizard.wizards;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.RegisteredPackageDialog;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.sap.furcas.ide.projectwizard.util.CodeGenerationException;
import com.sap.furcas.ide.projectwizard.util.ProjectInfo;

/**
 * This wizardpage is displayed when the user chooses to import some kind of existing MetaModel into his Metamodelproject.
 * 
 * @author Frederik Petersen (D054528)
 * 
 */
public class LoadPage extends WizardPage {
    /**
     * The FurcasWizard instance.
     */
    public FurcasWizard wizard;
    /**
     * The uri Textfield. It has no other use than displaying the URI to the chosen metamodel.
     */
    public Text uriField;
    /**
     * This label displayes an error Message if a wrong filetype is chosen.
     */
    public Label wrongType;
    /**
     * Keeps track of the user input.
     */
    ProjectInfo pi;
    /**
     * Keeps track of the chosen metamodel
     */
    public EPackage eP;
    /**
     * This is the next page.
     */
    ClassChooserPage cCP;

    /**
     * Sets the title and calls the super constructor etc.
     * 
     * @param pageName
     *            Name of the page
     * @param wiz
     *            The Furcas Wizard
     * @param pi
     *            The user input
     */
    protected LoadPage(String pageName, FurcasWizard wiz, ProjectInfo pi) {
        super(pageName);
        this.pi = pi;
        wizard = wiz;
        setTitle("Metamodel Load Page");
        setDescription("You can either choose an existing Metamodel from workspace or from registeres resources.");
    }

    /**
     * Creates the UI of this page. It consists of 2 buttons, a textfield and a label (for filetype errors). Also adds listeners
     * to the buttons that call dialogs upon clicking on them.
     */
    @Override
    public void createControl(Composite parent) {
        final Composite container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 3;
        Label label = new Label(container, SWT.NULL);
        label.setText("Resource URIs:");

        Button button1 = new Button(container, SWT.PUSH);
        button1.setText("Browse Registered Packages...");
        button1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                pi.setFromWorkspace(false);
                // Call the dialog that shows the registered EPackages
                //
                RegisteredPackageDialog registeredPackageDialog = new RegisteredPackageDialog(getShell());
                registeredPackageDialog.open();
                // Save the result
                //
                Object[] result = registeredPackageDialog.getResult();
                if (result != null) {
                    saveSelection(result);
                }
            }

            /**
             * Saves the chosen metamodel to the global variable <code>eP</code>. It also makes sure to choose a metamodel not having a 'super'metamodel
             * as the Builder can't handle it. If that is the case the 'super'metamodel is assigned to the local variable <code>eP</code>.
             * The method also sets the nsURI field in the ProjectInfo instance.
             */
            private void saveSelection(Object[] result) {
                List<?> nsURIs = Arrays.asList(result);
                ResourceSet resourceSet = new ResourceSetImpl();
                resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
                Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
                for (int i = 0, length = result.length; i < length; i++) {
                    URI location = ePackageNsURItoGenModelLocationMap.get(result[i]);
                    Resource resource = resourceSet.getResource(location, true);
                    EcoreUtil.resolveAll(resource);
                }
                for (Resource resource : resourceSet.getResources()) {
                    for (EPackage ePackage : getAllPackages(resource)) {
                        if (nsURIs.contains(ePackage.getNsURI())) {
                            // Save the EPackage to global var eP
                            //
                            EObject containingPackage = ePackage.eContainer();
                            if (containingPackage instanceof EPackage) {
                                for (EObject object : containingPackage.eContents()) {
                                    if (object instanceof EClass) {
                                        eP = (EPackage) containingPackage;
                                        break;
                                    } else {
                                        eP = ePackage;
                                    }
                                }
                            } else {
                                eP = ePackage;
                            }
                            pi.setNsURI(eP.getNsURI());
                            // Not really necessary, as it's not used.
                            //
                            uriField.setText(resource.getURI().toString());
                            break;
                        }
                    }

                }
            }

        });

        Button button3 = new Button(container, SWT.PUSH);
        button3.setText("Browse Workspace...");
        button3.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                // This filter filters out all non .ecore files.
                //
                class EcoreFilter extends ViewerFilter {

                    @Override
                    public boolean select(Viewer viewer, Object parentElement, Object element) {
                        if (element instanceof IFolder || element instanceof IProject) {
                            return true;
                        }
                        if (element instanceof IFile) {
                            IFile file = (IFile) element;
                            if (file.getFileExtension().matches("ecore")) {
                                return true;
                            }
                        }

                        return false;
                    }

                }
                pi.setFromWorkspace(true);
                List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
                EcoreFilter filter = new EcoreFilter();
                filters.add(filter);
                // Open a dialog showing the workspace tree allowing one to select a .ecore file from there
                //
                IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), "Choose Metamodel",
                        "Select the desired Metamodel an click OK.", false, null, filters);
                if (files.length > 0) {
                    // Set the appropriate values in ProjectInfo and eP
                    //
                    pi.setModelPath(files[0].getFullPath().toString());
                    try {
                        eP = fileToEPack(files[0]);
                    } catch (CodeGenerationException e) {
                        MessageDialog.openError(getShell(), "Error", e.getMessage());
                    }
                    pi.setNsURI(eP.getNsURI());
                    // Not really necessary, as it's not used.
                    //
                    uriField.setText(URI.createPlatformResourceURI(files[0].getFullPath().toString(), true).toString());
                }
            }
        });
        GridData gd = new GridData();
        gd.horizontalAlignment = GridData.FILL;
        gd.horizontalSpan = 4;
        uriField = new Text(container, SWT.NULL | SWT.BORDER);
        uriField.setLayoutData(gd);
        uriField.setEditable(false);
        uriField.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                dialogChanged();
            }
        });
        gd = new GridData();
        gd.horizontalAlignment = GridData.FILL;
        gd.verticalAlignment = GridData.FILL;
        gd.horizontalSpan = 4;
        gd.verticalSpan = 2;
        gd.grabExcessHorizontalSpace = true;
        wrongType = new Label(container, SWT.WRAP);
        wrongType.setText("You will only be able to choose .ecore files.");
        wrongType.setLayoutData(gd);
        setErrorMessage(null);
        setControl(container);

    }

    /**
     * Convert a file to the EPackage containing a metamodel.
     * 
     * @param iFile
     *            The file that is to be converted to the Epackage.
     * @return The EPackage containing the metamodel loaded from the file.
     * @throws CodeGenerationException
     */
    protected EPackage fileToEPack(IFile iFile) throws CodeGenerationException {
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
        URI fileURI = URI.createPlatformResourceURI("/" + iFile.getProject().getName() + "/"
                + iFile.getProjectRelativePath().toString(), true);
        Resource resource = resSet.createResource(fileURI);
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        try {
            resource.load(options);
        } catch (IOException e) {
            throw new CodeGenerationException("Error while loading resource of File: " + iFile.getName(), e.getCause());
        }
        EList<EObject> sd = resource.getContents();
        for (EObject object : sd) {
            if (object instanceof EPackage) {
                EPackage ePack = (EPackage) object;
                pi.setNsURI(ePack.getNsURI());
                return ePack;
            }
        }
        return null;
    }

    /**
     * Gets called when the URI textfield changes to check the input for mistakes and trim it.
     */
    protected void dialogChanged() {
        String text = uriField.getText();
        text = text.trim();
        if (!text.endsWith(".ecore")) {
            setPageComplete(false);
        } else {
            setPageComplete(true);
            getNextPage();
        }
        if (!uriField.getText().matches(text)) {
            uriField.setText(text);
        }
        Wizard supWizard = (Wizard) wizard;
        supWizard.getContainer().updateButtons();
        if (getNextPage() != null) {
            getNextPage().setTreeInput(eP);
        }
    }

    /**
     * @return the next page (an instance of the ClassChooserPage)
     */
    @Override
    public ClassChooserPage getNextPage() {
        if (cCP == null) {
            cCP = new ClassChooserPage("cCP", wizard.page.getProjectInfo());
            cCP.setPageComplete(false);
            wizard.addPage(cCP);
        }
        if (cCP.geteP() == null) {
            cCP.seteP(eP);
        }

        return cCP;
    }

    /**
     * Get all packages of a resource.
     * 
     * @param resource
     *            The resource containing the EPackages
     * @return A collection of the EPackages the resource contains.
     */
    protected Collection<EPackage> getAllPackages(Resource resource) {
        List<EPackage> result = new ArrayList<EPackage>();
        for (TreeIterator<?> j = new EcoreUtil.ContentTreeIterator<Object>(resource.getContents()) {
            private static final long serialVersionUID = 1L;

            @Override
            protected Iterator<? extends EObject> getEObjectChildren(EObject eObject) {
                return eObject instanceof EPackage ? ((EPackage) eObject).getESubpackages().iterator() : Collections
                        .<EObject> emptyList().iterator();
            }
        }; j.hasNext();) {
            Object content = j.next();
            if (content instanceof EPackage) {
                result.add((EPackage) content);
            }
        }
        return result;
    }
}