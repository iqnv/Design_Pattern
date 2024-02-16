package AdapterDesignPattern.adapter;

import AdapterDesignPattern.WeightMachine;

public class WeightMachineAdapter implements WeightAdapter{

    private WeightMachine weightMachine;

    public WeightMachineAdapter(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeight() {

        double weight = weightMachine.getWeightInPonds() * .45;
        return weight;
    }
}
