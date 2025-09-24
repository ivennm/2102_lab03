import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaTest {
    private PizzaStore store;

    @Test
    public void testPizzaCreationAndProcessing() {
        store = new PizzaStore();
        
        // Test each pizza type can be created and processed
        Pizza cheesePizza = store.orderPizza(PizzaType.CHEESE);
        assertNotNull("Cheese pizza should be created", cheesePizza);
        assertTrue("Cheese pizza should be instance of CheesePizza", cheesePizza instanceof CheesePizza);

        Pizza greekPizza = store.orderPizza(PizzaType.GREEK);
        assertNotNull("Greek pizza should be created", greekPizza);
        assertTrue("Greek pizza should be instance of GreekPizza", greekPizza instanceof GreekPizza);

        Pizza pepperoniPizza = store.orderPizza(PizzaType.PEPPERONI);
        assertNotNull("Pepperoni pizza should be created", pepperoniPizza);
        assertTrue("Pepperoni pizza should be instance of PepperoniPizza", pepperoniPizza instanceof PepperoniPizza);

        Pizza glutenFreePizza = store.orderPizza(PizzaType.GLUTENFREE);
        assertNotNull("Gluten-free pizza should be created", glutenFreePizza);
        assertTrue("Gluten-free pizza should be instance of GlutenFreePizza", glutenFreePizza instanceof GlutenFreePizza);
    }

    @Test
    public void testLiskovSubstitutionPrinciple() {
        store = new PizzaStore();
        Pizza[] pizzas = {
            store.orderPizza(PizzaType.CHEESE),
            store.orderPizza(PizzaType.GREEK),
            store.orderPizza(PizzaType.PEPPERONI),
            store.orderPizza(PizzaType.GLUTENFREE),
            store.orderPizza(PizzaType.VEGAN)
        };

        // Verify that all pizza types can be used interchangeably through the Pizza interface
        for (Pizza pizza : pizzas) {
            assertNotNull("Pizza should be created", pizza);
            // Each pizza should be able to execute all Pizza interface methods without errors
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}