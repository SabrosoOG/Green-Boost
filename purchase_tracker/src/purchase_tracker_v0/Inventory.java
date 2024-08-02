package purchase_tracker_v0;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<InventoryItem> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // Method to add an item
    public void addItem(InventoryItem item) {
        items.add(item);
    }

    // Method to remove an item by name
    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    // Method to get an item by name
    public InventoryItem getItem(String name) {
        for (InventoryItem item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null; // Item not found
    }

    // Method to remove an item by SKU
    public void removeItemSku(int sku) {
        items.removeIf(item -> item.getSku() == sku );
    }

    // Method to get an item by SKU
    public InventoryItem getItemSku(int sku) {
        for (InventoryItem item : items) {
            if (item.getSku() == sku) {
                return item;
            }
        }
        return null; // Item not found
    }

    // Method to display all items
    public void displayInventory() {
        for (InventoryItem item : items) {
            System.out.println(item);
        }
    }

    // Additional methods for inventory management can be added here
}
