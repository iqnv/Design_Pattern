package Head_Sate_Pattern;

public class HasQuater implements State{

    GumBallMachine gumBallMachine;

    public HasQuater(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insert() {
        System.out.println("You alreday has quater");

    }

    @Override
    public void trunkQuater() {
        System.out.println("Trunking the machine");
        dispense();
    }

    @Override
    public void dispense() {
        if (gumBallMachine.getCount() > 0) {
            gumBallMachine.setCount(gumBallMachine.getCount() - 1);
            gumBallMachine.setState(gumBallMachine.getSold());
        }
        else {
            gumBallMachine.setState(gumBallMachine.getOutOfQuater());
        }
    }
}
