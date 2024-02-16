package Head_Sate_Pattern;

public class OutOfQuater implements State{

    GumBallMachine gumBallMachine;
    public OutOfQuater(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insert() {
      System.out.println("Machine is out of order, you can not insert");

    }

    @Override
    public void trunkQuater() {
      System.out.println("You can not do this since , ou to order");
    }

    @Override
    public void dispense() {

    }
}
