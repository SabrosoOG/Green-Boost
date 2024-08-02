package purchase_tracker_v1;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<InventoryItem> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        items.add(item);
    }

    public void printInventory() {
        for (InventoryItem item : items) {
            System.out.println(item);
        }
    }
}