public class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore() {
        this.factory = new PizzaFactory();
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = factory.pizzaOrder(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
}