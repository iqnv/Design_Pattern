package Machine;

public class Item {

    ItemType itemType;
     int code;
     int price;

     public Item(ItemType itemType, int code, int price) {
         this.itemType = itemType;
         this.code = code;
         this.price = price;
     }

    public int getPrice() {
        return price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public int getCode() {
        return code;
    }
}
