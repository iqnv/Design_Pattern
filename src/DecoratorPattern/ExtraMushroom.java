package DecoratorPattern;

public class ExtraMushroom extends AddTopping{
    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;

    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
