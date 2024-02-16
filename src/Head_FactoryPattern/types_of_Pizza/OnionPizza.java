package Head_FactoryPattern.types_of_Pizza;

import Head_FactoryPattern.Pizza;

public class OnionPizza extends Pizza {

    private String name;
    public OnionPizza(String name) {
        this.name = name;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing OnionPizza");
        System.out.println("Prepaations End");
    }
}
