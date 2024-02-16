package Head_FactoryPattern;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
