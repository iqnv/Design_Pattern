package Machine;

import Machine.states.IdleState;

import java.util.ArrayList;
import java.util.List;

public class DriverMain {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        State state = null;
        vendingMachine.setInventory(fufillIneventory());
        vendingMachine.setState(new IdleState());
        state = vendingMachine.getState();
        state.insertCoin(vendingMachine, Coin.ONE);
        state = vendingMachine.getState();
        state.enterItemCode(vendingMachine, 100);
        state = vendingMachine.getState();
        state.dispatchItem(vendingMachine);
        state = vendingMachine.getState();
        state.dispatchItem(vendingMachine);


    }

    public static Inventory fufillIneventory() {
         List<Item> itemList = new ArrayList<>();
         Item item1 = new Item(ItemType.COKE, 101, 10);
        Item item2 = new Item(ItemType.SODA, 102, 12);
        Item item3 = new Item(ItemType.JUICE, 103, 13);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        Inventory inventory = new Inventory();
        inventory.setItemList(itemList);
        return inventory;


    }
}
