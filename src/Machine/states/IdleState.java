package Machine.states;

import Machine.Coin;
import Machine.State;
import Machine.VendingMachine;

import java.util.List;

public class IdleState implements State {
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {

        vendingMachine.setState(new HasCoinState(coin));
    }

    @Override
    public void enterItemCode(VendingMachine vendingMachine, int code) {

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
