package Head_FactoryPattern.types_of_Pizza;

import Head_FactoryPattern.Pizza;

public class CheesePizza extends Pizza {

    String name;
    public CheesePizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void prepare() {

    }
}
