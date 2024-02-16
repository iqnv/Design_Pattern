package Machine.states;

import Machine.Coin;
import Machine.State;
import Machine.VendingMachine;

import java.util.List;

public class HasItemCode implements State {
    int code;
    Coin coin;
    public HasItemCode(int code, Coin coin) {
      this.code = code;
      this.coin = coin;
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {

    }

    @Override
    public void enterItemCode(VendingMachine vendingMachine, int code) {

    }

    @Override
    public List<Coin> refundCoin(VendingMachine vendingMachine) {
        return null;
    }

    @Override
    public void cancel(VendingMachine vendingMachine) {

    }

    @Override
    public void dispatchItem(VendingMachine vendingMachine) {

        vendingMachine.setState(new DispatchState(coin, code));

    }
}
