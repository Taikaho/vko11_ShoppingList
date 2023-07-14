package olio_ohjelmointi_vko11.shoppinglist;

import java.util.ArrayList;

public class List {

    private static ArrayList<Item> items = new ArrayList<>();

    private static List list = null;

    private List() {
    }

    public static List getInstance() {
        if(list == null) {
            list = new List();
        }
        return list;
    }

    public static void addItem(String item) {
        items.add(new Item(item));
    }
        //System.out.print("Ostos lisätty");


    public void removeItem(String name) {
        int i  = 0;
        for (Item it : items) {
            if (it.getItemName().equals(name)) {
                break;
            }
            i++;
        }
        items.remove(i);
    }

    public ArrayList<Item> getItems() {

        return items;
    }

    public Item getItemByName (String itemName) {
        return items.get(Integer.parseInt(itemName));
    }
}
