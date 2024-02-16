package DesignPratice1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Duck duck = new ReadDuck(new flyWithWings(), new quackReal());
        duck.performFly();
    }
}