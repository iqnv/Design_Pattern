package Head_DecoratorPattern;

public class addMilk extends Decorator{
    public addMilk(Bevarage bevarage) {
        this.bevarage = bevarage;
    }
    public double cost() {
        return bevarage.cost() + 20;
    }


}
