package Head_FactoryPattern;

public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            BLRPizzaStore blrPizzaStore = new BLRPizzaStore();
            blrPizzaStore.orderPizza("OnionPizza");
        }
}
