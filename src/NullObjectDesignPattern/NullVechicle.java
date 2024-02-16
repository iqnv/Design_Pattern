package NullObjectDesignPattern;

public class NullVechicle implements Vehicle{
    @Override
    public int getFuelCapacity() {
        return 0;
    }

    @Override
    public int getSeatCapacity() {
        return 0;
    }
}
