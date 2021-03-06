package com.sap.furcas.modeladaptation.emf.lookup;

import static com.sap.furcas.test.testutils.ResolutionBeanHelper.refM;
import static com.sap.furcas.test.testutils.StringListHelper.list;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;

import com.sap.furcas.emf.stubs.EcoreAnyStub;
import com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage;
import com.sap.furcas.metamodel.FURCAS.TCS.stubs.ClassTemplateStub;
import com.sap.furcas.runtime.common.interfaces.IMetaModelLookup;
import com.sap.furcas.runtime.common.interfaces.ResolvedNameAndReferenceBean;
import com.sap.furcas.test.testutils.ResourceTestHelper;
import com.sap.furcas.test.testutils.StringListHelper;

public class TestQueryBasedEcoreMetaModelLookUp {

    private static IMetaModelLookup<EObject> lookup = null;

    @Before
    public void setup() throws Exception {
        Set<URI> referenceScope = ResourceTestHelper.createFURCASReferenceScope();
        referenceScope.addAll(ResourceTestHelper.createEcoreReferenceScope());
        lookup = new QueryBasedEcoreMetaModelLookUp(ResourceTestHelper.createResourceSet(), referenceScope);
    }

    @Test
    public void testFilterEClassifierList() throws Exception {
        List<String> qualifiedNameOfType = StringListHelper.list("package", "rightclass");
        List<EClassifier> expectedResult = new ArrayList<EClassifier>();

        List<EClassifier> inputEClassifiers = new ArrayList<EClassifier>();

        EcoreAnyStub classi3 = new EcoreAnyStub();
        classi3.name = "wrongclass"; // stub adds "package" in qualifiedname
        inputEClassifiers.add(classi3);

        EcoreAnyStub classi2 = new EcoreAnyStub();
        classi2.name = "rightclass"; // stub adds "package" in qualifiedname
        inputEClassifiers.add(classi2);
        expectedResult.add(classi2);

        EcoreAnyStub classi5 = new EcoreAnyStub();
        classi5.name = "wrongclass"; // stub adds "package" in qualifiedname
        inputEClassifiers.add(classi5);

        EcoreAnyStub classi = new EcoreAnyStub();
        classi.name = "rightclass"; // stub adds "package" in qualifiedname
        inputEClassifiers.add(classi);
        expectedResult.add(classi);

        EcoreAnyStub classi6 = new EcoreAnyStub();
        classi6.name = "wrongclass"; // stub adds "package" in qualifiedname
        inputEClassifiers.add(classi6);

        List<EClassifier> result = QueryBasedEcoreMetaModelLookUp.filterClassifiers(qualifiedNameOfType, inputEClassifiers);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetPrimitiveClasses() throws Exception {
        // failure here indicates that the PRI for PrimitiveTypes has not been included in query
        assertNotNull(lookup.resolveReference(list("ecore", "EString")));
        assertNotNull(lookup.resolveReference(list("ecore", "EIntegerObject")));
        assertNotNull(lookup.resolveReference(list("ecore", "EBoolean")));
        assertNotNull(lookup.resolveReference(list("ecore", "ELongObject")));
        assertNotNull(lookup.resolveReference(list("ecore", "EInt")));
        assertNotNull(lookup.resolveReference(list("ecore", "ELong")));
    }

    @Test
    public void testGetClasses() throws Exception {
        assertNotNull(lookup.resolveReference(list("FURCAS", "TCS", "ConcreteSyntax")));
        assertNotNull(lookup.resolveReference(list("FURCAS", "TCS", "Template")));
        assertNotNull(lookup.resolveReference(list("FURCAS", "TCS", "Keyword")));
        assertNotNull(lookup.resolveReference(StringListHelper.list("FURCAS", "TCS", "ClassTemplate")));
        assertNotNull(lookup.resolveReference(list("FURCAS", "TCS", "Token")));
        assertNotNull(lookup.resolveReference(list("FURCAS", "TCS", "PrimitiveTemplate")));

        assertNull(lookup.resolveReference(list("FURCAS", "TCS", "Classifier")));
        assertNull(lookup.resolveReference(list("FURCAS", "TCS", "XYZ")));
        assertNull(lookup.resolveReference(list("FURCAS", "TCS", "Year123")));
        assertNull(lookup.resolveReference(list("")));
        // assertFalse(lookup.resolveReference(null));
    }

    @Test
    public void testHasFeature() throws Exception {
        assertNotNull(lookup.getMultiplicity(refM("FURCAS", "TCS", "ConcreteSyntax"), "k"));
        assertNull(lookup.getMultiplicity(refM("FURCAS", "TCS", "Template"), "something"));
    }

    @Test
    public void testGetDirectSubTypes() throws Exception {
        List<ResolvedNameAndReferenceBean<EObject>> subTypes = new ArrayList<ResolvedNameAndReferenceBean<EObject>>();
        subTypes.add(refM("FURCAS", "TCS", "FunctionTemplate"));
        subTypes.add(refM("FURCAS", "TCS", "PrimitiveTemplate"));
        subTypes.add(refM("FURCAS", "TCS", "ContextTemplate"));
        subTypes.add(refM("FURCAS", "TCS", "EnumerationTemplate"));
        ResolvedNameAndReferenceBean<EObject> template = lookup.resolveReference(Arrays.asList("FURCAS", "TCS", "Template"));
        List<ResolvedNameAndReferenceBean<EObject>> caluclatedSubTypes = lookup.getDirectSubTypes(template);
        assertTrue(caluclatedSubTypes.containsAll(subTypes));
        assertTrue(subTypes.containsAll(caluclatedSubTypes));
    }

    @Test
    public void testHasFeatureForAssociationEnds() throws Exception {
        assertNotNull(lookup.getMultiplicity(refM("FURCAS", "TCS", "Template"), "concreteSyntax"));
        assertNull(lookup.getMultiplicity(refM("FURCAS", "TCS", "Template"), "entriesXYZ"));
    }

    @Test
    public void testGetMultiplicity() throws Exception {
        assertNotNull(lookup.getMultiplicity(refM("FURCAS", "TCS", "ConcreteSyntax"), "templates"));
        assertEquals(true, lookup.getMultiplicity(refM("FURCAS", "TCS", "ConcreteSyntax"), "templates").isOptional());
        assertEquals(true, lookup.getMultiplicity(refM("FURCAS", "TCS", "ConcreteSyntax"), "templates").isMultiple());
        assertEquals(false, lookup.getMultiplicity(refM("FURCAS", "TCS", "ClassTemplate"), "isMain").isOptional());
        assertEquals(false, lookup.getMultiplicity(refM("FURCAS", "TCS", "ClassTemplate"), "isMain").isMultiple());
        assertNull(lookup.getMultiplicity(refM("blabla"), "xyz"));
    }

    @Test
    public void testGetTypeClass() throws Exception {
        assertEquals(refM("FURCAS", "TCS", "Template"), lookup.getFeatureClassReference(refM("FURCAS", "TCS", "ConcreteSyntax"), "templates"));
        assertEquals(refM("FURCAS", "TCS", "Sequence"), lookup.getFeatureClassReference(refM("FURCAS", "TCS", "ClassTemplate"), "templateSequence"));
        assertEquals(refM("ecore", "EString"), lookup.getFeatureClassReference(refM("FURCAS", "TCS", "ConcreteSyntax"), "lexer"));
    }

    @Test
    public void testGetEnumLiterals() throws Exception {
        List<String> literals = lookup.getEnumLiterals(refM("FURCAS", "TCS", "Associativity"));
        assertNotNull(literals);
        assertEquals(2, literals.size());
        assertTrue(literals.contains("right"));
        assertTrue(literals.contains("left"));
    }
    
    @Test
    public void testValidateOCLQuery() throws Exception {
        ClassTemplateStub template = new ClassTemplateStub();
        template.metaReference = TCSPackage.eINSTANCE.getConcreteSyntax();
        
        assertTrue("Should yield no errors, as a ConcreteSyntax has a 'keywords' attribute",
             lookup.validateOclQuery(template, "self.keywords").isEmpty());;
             
        assertFalse("Should fail. A ConcreteSyntax has no such feature.",
             lookup.validateOclQuery(template, "self.someThingThatDoesNotExistForSure").isEmpty());;
    }
}
