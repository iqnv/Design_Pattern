package AdapterDesignPattern;

import AdapterDesignPattern.adapter.WeightAdapter;
import AdapterDesignPattern.adapter.WeightMachineAdapter;

public class Driver {

    public static void main(String[] args) {

        WeightMachine weightMachine = new WeightMachineForBabies(20.0);
        WeightAdapter weightAdapter = new WeightMachineAdapter(weightMachine);
        System.out.println(weightAdapter.getWeight());
    }
}
