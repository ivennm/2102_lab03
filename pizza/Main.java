public class Main {
    public static void main(String[] args) {
        System.out.println("Pizza Factory Demonstration\n");
        
        // Create a pizza store
        PizzaStore store = new PizzaStore();
        
        System.out.println("=== Ordering a Cheese Pizza ===");
        store.orderPizza(PizzaType.CHEESE);
        
        System.out.println("\n=== Ordering a Greek Pizza ===");
        store.orderPizza(PizzaType.GREEK);
        
        System.out.println("\n=== Ordering a Pepperoni Pizza ===");
        store.orderPizza(PizzaType.PEPPERONI);
        
        System.out.println("\n=== Ordering a Gluten-Free Pizza ===");
        store.orderPizza(PizzaType.GLUTENFREE);
        
        System.out.println("\n=== Ordering a Vegan Pizza ===");
        store.orderPizza(PizzaType.VEGAN);
        
        System.out.println("\n=== Trying to order an invalid pizza ===");
        store.orderPizza(null);
    }
}