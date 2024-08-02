package purchase_tracker_v1;
import java.util.List;

public class InventoryLoader {

    public static void loadInventory(String filePath, Inventory inventory) {
        List<String> lines = InventoryFileReader.readFile(filePath);

        for (String line : lines) {
            String[] parts = line.split(", ");
            if (parts.length == 4) {
                String name = parts[0].trim();
                int id = Integer.parseInt(parts[1].trim());
                double price = Double.parseDouble(parts[2].trim());
                int quantity = Integer.parseInt(parts[3].trim().replace(",", ""));

                InventoryItem item = new InventoryItem(name, id, price, quantity);
                inventory.addItem(item);
            }
        }
    }
}