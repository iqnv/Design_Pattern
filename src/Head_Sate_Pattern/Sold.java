package Head_Sate_Pattern;

public class Sold implements State{

    GumBallMachine gumBallMachine;
    public Sold(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insert() {
       System.out.println("You are not allowed to insert this time");
    }

    @Override
    public void trunkQuater() {
        System.out.println("You already did this");
    }

    @Override
    public void dispense() {

    }
}
