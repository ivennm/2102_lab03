import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PizzaFactoryTest {
    private PizzaStore pizzaStore;
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        pizzaStore = new PizzaStore();
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCheesePizzaCreation() {
        Pizza pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        assertNotNull("Cheese pizza should not be null", pizza);
        assertTrue("Should create a CheesePizza instance", pizza instanceof CheesePizza);
        String output = outContent.toString();
        assertTrue("Should prepare cheese pizza", output.contains("Preparing a Cheese"));
        assertTrue("Should bake cheese pizza", output.contains("Baking a Cheese"));
        assertTrue("Should cut cheese pizza", output.contains("Cutting a Cheese"));
        assertTrue("Should box cheese pizza", output.contains("Boxing a Cheese"));
    }

    @Test
    public void testGreekPizzaCreation() {
        Pizza pizza = pizzaStore.orderPizza(PizzaType.GREEK);
        assertNotNull("Greek pizza should not be null", pizza);
        assertTrue("Should create a GreekPizza instance", pizza instanceof GreekPizza);
        String output = outContent.toString();
        assertTrue("Should prepare Greek pizza", output.contains("Preparing a Greek"));
        assertTrue("Should bake Greek pizza", output.contains("Baking a Greek"));
        assertTrue("Should cut Greek pizza", output.contains("Cutting a Greek"));
        assertTrue("Should box Greek pizza", output.contains("Boxing a Greek"));
    }

    @Test
    public void testPepperoniPizzaCreation() {
        Pizza pizza = pizzaStore.orderPizza(PizzaType.PEPPERONI);
        assertNotNull("Pepperoni pizza should not be null", pizza);
        assertTrue("Should create a PepperoniPizza instance", pizza instanceof PepperoniPizza);
        String output = outContent.toString();
        assertTrue("Should prepare Pepperoni pizza", output.contains("Preparing a Peperoni"));
        assertTrue("Should bake Pepperoni pizza", output.contains("Baking a Peperoni"));
        assertTrue("Should cut Pepperoni pizza", output.contains("Cutting a Peperoni"));
        assertTrue("Should box Pepperoni pizza", output.contains("Boxing a Peperoni"));
    }

    @Test
    public void testGlutenFreePizzaCreation() {
        Pizza pizza = pizzaStore.orderPizza(PizzaType.GLUTENFREE);
        assertNotNull("Gluten-free pizza should not be null", pizza);
        assertTrue("Should create a GlutenFreePizza instance", pizza instanceof GlutenFreePizza);
        String output = outContent.toString();
        assertTrue("Should prepare Gluten-free pizza", output.contains("Preparing a GlutenFree"));
        assertTrue("Should bake Gluten-free pizza", output.contains("Baking a GlutenFree"));
        assertTrue("Should cut Gluten-free pizza", output.contains("Cutting a GlutenFree"));
        assertTrue("Should box Gluten-free pizza", output.contains("Boxing a GlutenFree"));
    }

    @Test
    public void testVeganPizzaCreation() {
        Pizza pizza = pizzaStore.orderPizza(PizzaType.VEGAN);
        assertNotNull("Vegan pizza should not be null", pizza);
        assertTrue("Should create a VeganPizza instance", pizza instanceof VeganPizza);
        String output = outContent.toString();
        assertTrue("Should prepare Vegan pizza", output.contains("Preparing a Vegan"));
        assertTrue("Should bake Vegan pizza", output.contains("Baking a Vegan"));
        assertTrue("Should cut Vegan pizza", output.contains("Cutting a Vegan"));
        assertTrue("Should box Vegan pizza", output.contains("Boxing a Vegan"));
    }

    @Test
    public void testPizzaFactoryNullCase() {
        PizzaFactory factory = new PizzaFactory();
        // Test with null type
        assertNull("Should return null for invalid pizza type", factory.pizzaOrder(null));
    }

    @Test
    public void testLiskovSubstitutionPrinciple() {
        // Test that all pizza types can be used interchangeably
        PizzaType[] types = {
            PizzaType.CHEESE,
            PizzaType.GREEK,
            PizzaType.PEPPERONI,
            PizzaType.GLUTENFREE,
            PizzaType.VEGAN
        };

        for (PizzaType type : types) {
            outContent.reset();
            Pizza pizza = pizzaStore.orderPizza(type);
            assertNotNull("Pizza should not be null", pizza);
            String output = outContent.toString();
            assertTrue("Output should contain prepare step", 
                output.contains("Preparing"));
            assertTrue("Output should contain bake step", 
                output.contains("Baking"));
            assertTrue("Output should contain cut step", 
                output.contains("Cutting"));
            assertTrue("Output should contain box step", 
                output.contains("Boxing"));
        }
    }

    @Test
    public void testPizzaStoreComposition() {
        // Test that PizzaStore properly composes PizzaFactory
        PizzaStore store = new PizzaStore();
        Pizza pizza = store.orderPizza(PizzaType.CHEESE);
        assertNotNull("PizzaStore should successfully create pizza using factory", pizza);
        assertTrue("PizzaStore should create correct pizza type", pizza instanceof CheesePizza);
    }
}