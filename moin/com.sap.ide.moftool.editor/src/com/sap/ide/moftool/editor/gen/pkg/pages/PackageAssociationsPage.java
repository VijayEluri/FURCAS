package com.sap.ide.moftool.editor.gen.pkg.pages;

import com.sap.ide.moftool.editor.fwk.TableLayoutedModelFormMasterDetailPage;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;

import com.sap.tc.moin.repository.mmi.reflect.RefObject;

import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.editor.IFormPage;

import com.sap.ide.moftool.editor.fwk.ModelDetailsPageProvider;
import com.sap.ide.moftool.editor.fwk.ModelMasterDetailBlock;
import com.sap.ide.moftool.editor.fwk.TreeSection;
import org.eclipse.ui.IWorkbenchPart;

public class PackageAssociationsPage extends TableLayoutedModelFormMasterDetailPage {

	private static final String ID = "pkg.pages.packageAssociations"; //$NON-NLS-1$

	public PackageAssociationsPage(FormEditor editor, String title) {
		super(editor, ID, title);
	}

	@Override
	protected MasterDetailPart createMasterBlockInternal(Composite body, IManagedForm managedForm) {
		MasterDetailPart part = new MasterDetailPart(this);
		part.createContent(managedForm);
		return part;
	}

	private class MasterDetailPart extends ModelMasterDetailBlock {

		protected MasterDetailPart(IFormPage page) {
			super(page);
		}

		protected SectionPart createMasterPartInternal(Composite parent, IManagedForm managedForm) {
			return new PackageAssociationsPage.TreeSectionImpl(getPage(), parent, managedForm,
					Messages.PackageAssociationsPage_Associations);
		}

		@Override
		protected IDetailsPageProvider createDetailsProvider() {
			return new DetailsPageProvider(getManagedForm());
		}

	}

	/**
	 * Details page handling ContextNodes. The details page will be lazily
	 * instantiated for ContextNode selections.
	 */
	private class DetailsPageProvider extends ModelDetailsPageProvider {

		public DetailsPageProvider(IManagedForm managedForm) {
			super(managedForm);
		}

		public IDetailsPage getPage(Object key) {

			if (com.sap.tc.moin.repository.mmi.model.Association.class.equals(key)) {
				return new com.sap.ide.moftool.editor.gen.sections.AssociationSection.DetailsPage(getManagedForm());
			}

			if (com.sap.tc.moin.repository.mmi.model.AssociationEnd.class.equals(key)) {
				return new com.sap.ide.moftool.editor.gen.sections.AssociationEndSection.DetailsPage(getManagedForm());
			}

			if (com.sap.tc.moin.repository.mmi.model.Constraint.class.equals(key)) {
				return new com.sap.ide.moftool.editor.gen.sections.ConstraintSection.DetailsPage(getManagedForm());
			}

			if (com.sap.tc.moin.repository.mmi.model.Tag.class.equals(key)) {
				return new com.sap.ide.moftool.editor.gen.sections.TagSection.DetailsPage(getManagedForm());
			}

			if (com.sap.tc.moin.repository.mmi.model.Reference.class.equals(key)) {
				return new com.sap.ide.moftool.editor.gen.sections.ReferencePropertiesSection.DetailsPage(
						getManagedForm());
			}

			return null;
		}

		public Object getPageKeyInternal(RefObject object) {

			if (object instanceof com.sap.tc.moin.repository.mmi.model.Association) {
				return com.sap.tc.moin.repository.mmi.model.Association.class;
			}

			if (object instanceof com.sap.tc.moin.repository.mmi.model.AssociationEnd) {
				return com.sap.tc.moin.repository.mmi.model.AssociationEnd.class;
			}

			if (object instanceof com.sap.tc.moin.repository.mmi.model.Constraint) {
				return com.sap.tc.moin.repository.mmi.model.Constraint.class;
			}

			if (object instanceof com.sap.tc.moin.repository.mmi.model.Tag) {
				return com.sap.tc.moin.repository.mmi.model.Tag.class;
			}

			if (object instanceof com.sap.tc.moin.repository.mmi.model.Reference) {
				return com.sap.tc.moin.repository.mmi.model.Reference.class;
			}

			return null;
		}
	}

	private class TreeSectionImpl extends TreeSection {
		public TreeSectionImpl(IWorkbenchPart part, Composite parent, IManagedForm managedForm, String title) {
			super(part, parent, managedForm, title);
		}

		protected IBaseLabelProvider createLabelProvider() {
			return new com.sap.ide.moftool.editor.tree.provider.TreeLabelProviderTreePackageAssociations();
		}

		protected ITreeContentProvider createContentProvider() {
			return new com.sap.ide.moftool.editor.tree.provider.TreeProviderTreePackageAssociations();
		}

		protected org.eclipse.ui.actions.ActionGroup getActionProvider(IWorkbenchPart part) {
			com.sap.ide.moftool.editor.action.prov.ActProvAPTPackageAssociations provider = new com.sap.ide.moftool.editor.action.prov.ActProvAPTPackageAssociations();
			provider.init(part);
			return provider;
		}

	}

}