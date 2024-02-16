package Machine.states;

import Machine.Coin;
import Machine.State;
import Machine.VendingMachine;

import java.util.List;

public class HasCoinState implements State {
     Coin coin;
    public HasCoinState(Coin coin) {
        this.coin = coin;
    }
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new RuntimeException("Coin can not be inserted");
    }

    @Override
    public void enterItemCode(VendingMachine vendingMachine, int code) {
        // search for code in inventory
        vendingMachine.setState(new HasItemCode(code, coin));
    }

    @Override
    public List<Coin> refundCoin(VendingMachine vendingMachine) {
        throw new RuntimeException("Can't refund");
    }

    @Override
    public void cancel(VendingMachine vendingMachine) {

    }

    @Override
    public void dispatchItem(VendingMachine vendingMachine) {

    }
}
