package NullObjectDesignPattern;

public class Car implements Vehicle{
    @Override
    public int getFuelCapacity() {
        return 20;
    }

    @Override
    public int getSeatCapacity() {
        return 5;
    }
}
