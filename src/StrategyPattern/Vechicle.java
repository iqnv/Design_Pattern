package StrategyPattern;

public class Vechicle {


    DriveFunctionality driveFunctionality;

    Vechicle(DriveFunctionality driveFunctionality) {
        this.driveFunctionality = driveFunctionality;
        
    }
    public void drive() {
       driveFunctionality.drive();
    }
}
