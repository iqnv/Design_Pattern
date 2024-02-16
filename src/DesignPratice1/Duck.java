package DesignPratice1;

public abstract class Duck {

    flyBeahavior flyBeahavior;
    quackBehavior quackBehavior;

    Duck(flyBeahavior flyBeahavior, quackBehavior quackBehavior) {
        this.flyBeahavior = flyBeahavior;
        this.quackBehavior = quackBehavior;
    }
    public void performFly() {
        flyBeahavior.fly();
    }
    public abstract void Display();
}
