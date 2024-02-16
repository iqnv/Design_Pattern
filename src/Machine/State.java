package Machine;

import java.util.List;

public interface State {

    void insertCoin(VendingMachine vendingMachine, Coin coin);
    void enterItemCode(VendingMachine vendingMachine, int code);
    List<Coin> refundCoin(VendingMachine vendingMachine);
    void cancel(VendingMachine vendingMachine);
    void dispatchItem(VendingMachine vendingMachine);

}
