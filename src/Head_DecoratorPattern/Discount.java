package Head_DecoratorPattern;

public class Discount extends Decorator{

    public Discount(Bevarage bevarage) {
        this.bevarage = bevarage;
    }
    @Override
    public double cost() {
        return bevarage.cost() - 10;
    }
}
