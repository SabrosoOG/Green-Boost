package purchase_tracker_v1;

public class Driver {

    public static void main(String[] args) {
        // Assuming Inventory, InventoryItem, and Transaction classes are already defined
        Inventory inventory = new Inventory();

        // Path to the inventory file
        String filePath = "../test_inventory.txt";

        // Load the inventory from the file
        InventoryLoader.loadInventory(filePath, inventory);

        // Print the inventory to verify
        inventory.printInventory();  // Assuming Inventory class has a method to print items
    }
}