package NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
           VechileFactory vechileFactory = new VechileFactory("Car");
           Vehicle vehicle = printSpecification(vechileFactory);
           System.out.println(vehicle.getFuelCapacity());
           System.out.println(vehicle.getSeatCapacity());
    }
    public static Vehicle printSpecification(VechileFactory vechileFactory) {
        if (vechileFactory.vehcileType.equals("Car")) {
            return new Car();
        }
        return new NullVechicle();
    }
}