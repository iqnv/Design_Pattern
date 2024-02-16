package Machine.states;

import Machine.Coin;
import Machine.Item;
import Machine.State;
import Machine.VendingMachine;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class DispatchState implements State {



    Coin coin;
    int code;

    public DispatchState(Coin coin, int code) {
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
        System.out.println("There is nothing to return");
        return null;
    }

    @Override
    public void cancel(VendingMachine vendingMachine) {

    }

    @Override
    public void dispatchItem(VendingMachine vendingMachine) {
         List<Item> itemList = vendingMachine.getInventory().getItemList();
         Optional<Item> item = itemList.stream().filter(item1 -> item1.getCode() == code).findFirst();
         if (item.isPresent()) {
             int price = item.get().getPrice();
             // if price matches
             System.out.println("Item is sold");

             refundCoin(vendingMachine);
             vendingMachine.setState(new IdleState());
         }

    }
}
