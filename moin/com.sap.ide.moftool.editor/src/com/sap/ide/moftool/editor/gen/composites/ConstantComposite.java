package com.sap.ide.moftool.editor.gen.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import com.sap.mi.fwk.ui.databinding.MoinDataBindingContext;
import com.sap.ide.moftool.editor.sections.ModelDataBoundSection;

import com.sap.ide.moftool.editor.core.service.ModelElementService;

public class ConstantComposite extends ModelDataBoundSection<com.sap.tc.moin.repository.mmi.model.Constant> {

	private com.sap.ide.moftool.editor.fwk.BrowseTypeControl type = null;

	private org.eclipse.swt.widgets.Text value = null;

	private org.eclipse.swt.widgets.Text name = null;

	private org.eclipse.swt.widgets.Text annotation = null;

	public ConstantComposite(Section section, FormToolkit formToolkit, String title, String description) {
		super(section, formToolkit, title, description);
	}

	@Override
	public void createControls(Composite rootComposite, FormToolkit toolkit) {
		GridLayout layout = new GridLayout(2, false);
		rootComposite.setLayout(layout);
		rootComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

		name = createSingleLineText(Messages.ConstantComposite_Name, false, rootComposite, toolkit);

		annotation = createMultiLineText(Messages.ConstantComposite_Annotation, 3, false, rootComposite, toolkit);

		type = createTypeBrowser(Messages.ConstantComposite_Type,
				com.sap.ide.moftool.editor.fwk.BrowseTypeControl.TypeFilter.Primitive, false, rootComposite, toolkit);

		value = createSingleLineText(Messages.ConstantComposite_Value, false, rootComposite, toolkit);

	}

	@Override
	protected void createBindings(MoinDataBindingContext dbc, com.sap.tc.moin.repository.mmi.model.Constant refObject) {

		org.eclipse.core.databinding.observable.value.IObservableValue nameModel = com.sap.mi.fwk.ui.databinding.MoinObservables
				.observeValue(refObject, com.sap.tc.moin.repository.mmi.model.Constant.DESCRIPTORS.NAME());
		bindText(name, dbc, nameModel);

		org.eclipse.core.databinding.observable.value.IObservableValue annotationModel = com.sap.mi.fwk.ui.databinding.MoinObservables
				.observeValue(refObject, com.sap.tc.moin.repository.mmi.model.Constant.DESCRIPTORS.ANNOTATION());
		bindText(annotation, dbc, annotationModel);

		type.setInput(refObject, Messages.ConstantComposite_Type, com.sap.tc.moin.repository.mmi.model.Constant.DESCRIPTORS.TYPE(), dbc);

		org.eclipse.core.databinding.observable.value.IObservableValue valueModel = com.sap.mi.fwk.ui.databinding.MoinObservables
				.observeValue(refObject, com.sap.tc.moin.repository.mmi.model.Constant.DESCRIPTORS.VALUE());
		bindText(value, dbc, valueModel);

		dbc.addValidationStatusProvider(new com.sap.ide.moftool.editor.fwk.MoinValidator(refObject, dbc.getBindings()));

		if (ModelElementService.isForeignObject(refObject)) {
			disableAllControls();
		}

	}

}