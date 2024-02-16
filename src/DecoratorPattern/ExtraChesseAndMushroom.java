package DecoratorPattern;

public class ExtraChesseAndMushroom extends ExtraMushroom{
    BasePizza basePizza;
    public ExtraChesseAndMushroom(BasePizza basePizza) {
        super(basePizza);

        this.basePizza = basePizza;
    }

        public int cost() {
            return basePizza.cost() + 40;
        }

}
