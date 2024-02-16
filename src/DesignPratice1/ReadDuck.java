package DesignPratice1;

public class ReadDuck extends Duck{
    ReadDuck(DesignPratice1.flyBeahavior flyBeahavior, DesignPratice1.quackBehavior quackBehavior) {
        super(flyBeahavior, quackBehavior);
    }

    @Override
    public void Display() {
        System.out.println("Here is the red duck");

    }
    public void SQuack() {
        System.out.println("Quack");
    }

}
