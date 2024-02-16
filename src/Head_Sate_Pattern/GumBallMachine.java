package Head_Sate_Pattern;

public class GumBallMachine {

    State state;
    State noQuater;
    State hasQuater;
    State sold;
    State outOfQuater;

     int count;

    public GumBallMachine(int n) {
        noQuater = new NoQuater(this);
        hasQuater = new HasQuater(this);
        sold = new Sold(this);
        outOfQuater = new OutOfQuater(this);
        this.count = n;
        if (count > 0) {
           setState(noQuater);

        }

    }

    public void insert() {
        state.insert();
    }
    public void trunk() {
        state.trunkQuater();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoQuater() {
        return noQuater;
    }


    public State getHasQuater() {
        return hasQuater;
    }

    public State getSold() {
        return sold;
    }

    public void setSold(State sold) {
        this.sold = sold;
    }

    public State getOutOfQuater() {
        return outOfQuater;
    }

    public void setOutOfQuater(State outOfQuater) {
        this.outOfQuater = outOfQuater;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
