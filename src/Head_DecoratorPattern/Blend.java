package Head_DecoratorPattern;

public class Blend extends Decorator{

    public Blend(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public double cost() {
        return 40 + bevarage.cost();
    }
}
