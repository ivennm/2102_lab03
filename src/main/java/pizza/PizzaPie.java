public class PizzaPie implements Pizza {
    private PizzaType pizzaType;

    public PizzaPie() {
        this.pizzaType = PizzaType.CHEESE; // Default type
    }

    public void prepare() {
        System.out.println("Preparing a basic pizza");
    }

    public void bake() {
        System.out.println("Baking a basic pizza");
    }

    public void cut() {
        System.out.println("Cutting a basic pizza");
    }

    public void box() {
        System.out.println("Boxing a basic pizza");
    }
}