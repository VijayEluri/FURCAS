package com.sap.furcas.parser.tcs.scenario;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.furcas.parsergenerator.TCSSyntaxContainerBean;
import com.sap.furcas.runtime.parser.ParserFacade;
import com.sap.furcas.runtime.parser.exceptions.UnknownProductionRuleException;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserBasedTest;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserTestConfiguration;
import com.sap.furcas.runtime.parser.testbase.ParsingHelper;
import com.sap.furcas.runtime.parser.testbase.StubModelAdapter;
import com.sap.furcas.runtime.parser.testbase.StubModelElement;
import com.sap.furcas.test.fixture.ScenarioFixtureData;

/**
 * Simple Test for the custom Expression language
 */
public class TestPeople extends GeneratedParserBasedTest {

    private static final String LANGUAGE = "People";
    private static final File TCS = ScenarioFixtureData.PEOPLE_TCS;
    private static final File[] METAMODELS = { ScenarioFixtureData.PEOPLE_METAMODEL };

    private static ParsingHelper parsingHelper;

    @BeforeClass
    public static void setupParser() throws Exception {
        GeneratedParserTestConfiguration testConfig = new GeneratedParserTestConfiguration(LANGUAGE, TCS, METAMODELS);
        TCSSyntaxContainerBean syntaxBean = parseSyntax(testConfig);
        ParserFacade facade = generateParserForLanguage(syntaxBean, testConfig, new ClassLookupImpl());
        parsingHelper = new ParsingHelper(facade);
    }

    @Test
    public void testSampleDirect() throws Exception {

        String world1 = "world {\n" + "  Germany [ \n" + "    Karlsruhe (\n" + "      \"John Doe\" @ Berlin\n" + "    )\n"
                + "	 representative: \"Erwin Meier\" ,\n" + "    Berlin(\n" + "	   \"Erwin Meier\" @ Berlin\n" + "	   ("
                + "			mother:\"Ute Meier\"\n" +
                // "		    father:\"Michael Meier\"" +
                "		)\n" + "		spouse: \"Ute Meier\"" + "	 ),\n" + "    Koeln(\n" + "	   \"Ute Meier\" @ Koeln\n" +
                // "	   \"Michael Meier\" @ Berlin\n" +
                "	 )\n" + "  ]\n" + "  capital: Berlin\n" + "}\n";
        StubModelAdapter stubModelHandler = parseString(world1, 0);

        Set<StubModelElement> nations = stubModelHandler.getElementsbyType("People::Nation");
        Set<StubModelElement> persons = stubModelHandler.getElementsbyType("People::Person");
        Set<StubModelElement> cities = stubModelHandler.getElementsbyType("People::City");

        assertEquals(1, nations.size());
        assertEquals(3, cities.size());
        assertEquals(3, persons.size());

        StubModelElement nation1 = nations.iterator().next();
        assertEquals("Germany", nation1.get("name"));

        Iterator<StubModelElement> cityIt = cities.iterator();
        StubModelElement city1 = cityIt.next();
        StubModelElement city2 = cityIt.next();
        StubModelElement city3 = cityIt.next();

        StubModelElement karlsruhe;
        StubModelElement berlin;
        StubModelElement koeln;
        if (city1.get("name").equals("Berlin")) {
            berlin = city1;
            if (city2.get("name").equals("Karlsruhe")) {
                karlsruhe = city2;
                koeln = city3;
            } else {
                karlsruhe = city3;
                koeln = city2;
            }
        } else if (city1.get("name").equals("Karlsruhe")) {
            karlsruhe = city1;
            if (city2.get("name").equals("Berlin")) {
                berlin = city2;
                koeln = city3;
            } else {
                berlin = city3;
                koeln = city2;
            }
        } else {
            koeln = city1;
            if (city2.get("name").equals("Berlin")) {
                berlin = city2;
                karlsruhe = city3;
            } else {
                berlin = city3;
                karlsruhe = city2;
            }
        }

        StubModelElement person1 = (StubModelElement) karlsruhe.get("persons");
        assertEquals("John Doe", person1.get("name"));

        StubModelElement person2 = (StubModelElement) berlin.get("persons");
        assertEquals("Erwin Meier", person2.get("name"));
        assertEquals(koeln.get("persons"), person2.get("parents"));

        assertEquals(koeln.get("persons"), person2.get("spouse"));

        assertEquals("Berlin", berlin.get("name"));
        assertEquals(berlin, nation1.get("capital"));
        assertEquals("Karlsruhe", karlsruhe.get("name"));
        assertEquals(person2, karlsruhe.get("representative"));

        // stubmodel does not deal with multivalued properties
        assertEquals(person1, (karlsruhe.get("persons")));
        assertEquals(berlin, person1.get("embassy"));
        assertEquals(berlin, person1.get("embassy2"));

        assertEquals(berlin, person1.get("currentlyIn"));

        // default values from syntax
        assertEquals(new Integer(42), person1.get("age"));
        assertEquals(new Boolean(true), person1.get("male"));
        assertEquals(new Double(1.83), person1.get("height"));
        assertEquals("Viper", person1.get("codeName"));
    }

    @Test
    public void testPostFixOperator() throws Exception {

        String world1 = "heaven {\n" + "  Germany [ \n" + "    Karlsruhe (\n" + "      \"John Doe\" @ Berlin\n" + "    )\n"
                + "  ]\n" + "  capital: Karlsruhe\n" + "}\n" + "--This is a comment\n" + "defs: \"John Doe\"*\n";
        StubModelAdapter stubModelHandler = parseString(world1, 0);

        Set<StubModelElement> worlds = stubModelHandler.getElementsbyType("People::World");
        Set<StubModelElement> nations = stubModelHandler.getElementsbyType("People::Nation");
        Set<StubModelElement> persons = stubModelHandler.getElementsbyType("People::Person");
        Set<StubModelElement> cities = stubModelHandler.getElementsbyType("People::City");
        Set<StubModelElement> defs = stubModelHandler.getElementsbyType("People::ConcretePersonDefinition");
        Set<StubModelElement> nesteddefs = stubModelHandler.getElementsbyType("People::NestedPersonDefinition");

        assertEquals(1, worlds.size());
        assertEquals(1, nations.size());
        assertEquals(1, cities.size());
        assertEquals(1, persons.size());
        assertEquals(1, defs.size());
        assertEquals(1, nesteddefs.size());

        StubModelElement world = worlds.iterator().next();

        StubModelElement nation1 = nations.iterator().next();
        assertEquals("Germany", nation1.get("name"));

        StubModelElement person1 = persons.iterator().next();
        assertEquals("John Doe", person1.get("name"));

        StubModelElement def = defs.iterator().next();
        assertEquals(person1, def.get("person"));
        StubModelElement nestedDef = nesteddefs.iterator().next();
        assertEquals(nestedDef, world.get("definitions"));
        assertEquals(def, nestedDef.get("nestedPersonDefinition"));
        assertEquals("*", nestedDef.get("op"));
    }

    // Override ModelAdapter to allow setting of inverse references when setting nation.cities: also set city.nation
    protected StubModelAdapter parseString(String sample, int expectedErrors) throws IOException,
            UnknownProductionRuleException {
        StubModelAdapter stubModelHandler = new StubModelAdapter() {

            @Override
            public void set(Object ame, String prop, Object value) {
                super.set(ame, prop, value);
                if (prop.equals("cities") && value != null) {
                    ((StubModelElement) value).set("nation", ame);
                }
            }

            @Override
            public Object setReferenceWithOCLQuery(Object modelElement, String propertyName, Object keyValue, String mqlQuery,
                    Object contextObject, Object currentForeachElement) {
                Object result = null;
                if (propertyName.equals("representative")) {
                    StubModelElement capital = ((StubModelElement) ((StubModelElement) contextObject).get("capital"));
                    if (capital != null) {
                        result = capital.get("persons");
                        ((StubModelElement) modelElement).set("representative", result);
                    }
                } else if (propertyName.equals("embassy2") && ((StubModelElement) modelElement).get("currentlyIn") != null
                        && ((StubModelElement) ((StubModelElement) modelElement).get("currentlyIn")).get("nation") != null) {
                    result = ((StubModelElement) ((StubModelElement) ((StubModelElement) modelElement).get("currentlyIn"))
                            .get("nation")).get("capital");
                    ((StubModelElement) modelElement).set("embassy2", result);
                } else if (propertyName.equals("spouse")) {
                    for (StubModelElement person : getElementsbyType("People::Person")) {
                        if (person.get("name").equals(keyValue)) {
                            result = person;
                            ((StubModelElement) modelElement).set("spouse", result);
                            break;
                        }
                    }
                }
                return result;
            }

        };

        InputStream charStream = new ByteArrayInputStream(sample.getBytes());
        parsingHelper.parseStream(expectedErrors, charStream, stubModelHandler);
        return stubModelHandler;
    }
}