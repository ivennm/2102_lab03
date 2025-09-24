public class PizzaFactory {
    public Pizza pizzaOrder(PizzaType type) {
        if (type == null) {
            System.err.println("Invalid pizza type ordered");
            return null;
        }
        
        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case GREEK:
                return new GreekPizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case GLUTENFREE:
                return new GlutenFreePizza();
            case VEGAN:
                return new VeganPizza();  
            default:
                System.err.println("Invalid pizza type ordered");
                return null;
        }
    }
}