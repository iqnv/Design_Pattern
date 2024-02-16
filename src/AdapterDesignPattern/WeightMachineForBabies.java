package AdapterDesignPattern;

public class WeightMachineForBabies implements WeightMachine{

    private double weight;

    public WeightMachineForBabies(double weight) {
        this.weight = weight;
    }
    @Override
    public double getWeightInPonds() {
        return weight;
    }
}
