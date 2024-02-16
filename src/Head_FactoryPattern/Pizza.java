package Head_FactoryPattern;

public abstract class Pizza {

    String bake;
    public void bake() {
        System.out.println("Pizza is balking");

    }
    public abstract void prepare();

}
