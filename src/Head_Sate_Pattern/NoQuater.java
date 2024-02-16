package Head_Sate_Pattern;

public class NoQuater implements State{
    GumBallMachine gumBallMachine;
    public NoQuater(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insert() {
        System.out.println("You have entered the Quater");
        gumBallMachine.setState(gumBallMachine.getHasQuater());
    }

    @Override
    public void trunkQuater() {
       System.out.println("Please insert the quater first");
    }

    @Override
    public void dispense() {

    }
}
