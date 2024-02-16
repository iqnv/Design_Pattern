package Head_FactoryPattern;

import Head_FactoryPattern.types_of_Pizza.CheesePizza;
import Head_FactoryPattern.types_of_Pizza.OnionPizza;

public class BLRPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {

        switch (type){
            case "OnionPizza": return new OnionPizza("OnionPizza");
            case "CheesePizza": return  new CheesePizza("CheesePizza");
        }
        return null;
    }
}
