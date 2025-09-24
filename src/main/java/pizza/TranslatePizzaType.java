public class TranslatePizzaType {

    public static String fromPizzaTypeEnumToString(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return "Cheese";
            case PEPPERONI:
                return "Peperoni";
            case GREEK:
                return "Greek";
            case GLUTENFREE:
                return "GlutenFree";
            case VEGAN:
                return "Vegan";
            default:
                System.err.println("Not a valid pizza type.");
                return "Unknown";
        }
    }
}