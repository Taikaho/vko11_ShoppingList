package olio_ohjelmointi_vko11.shoppinglist;

import java.io.Serializable;

public class Item implements Serializable {

    protected String itemName;

    public Item (String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String newName) {
        this.itemName = newName;
    }
}


