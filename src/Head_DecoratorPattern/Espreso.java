package Head_DecoratorPattern;

public class Espreso extends Bevarage {

    public Espreso(String description) {
       description = description;
    }


    public String getDescription() {
        return "Esperso" + getDescription();
    }

    public double cost() {
        return 10 ;
    }
}
