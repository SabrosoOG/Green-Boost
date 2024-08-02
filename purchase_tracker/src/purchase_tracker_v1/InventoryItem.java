package purchase_tracker_v1;

public class InventoryItem {
    private String name;
    private int id;
    private double price;
    private int quantity;

    public InventoryItem(String name, int id, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Price: " + price + ", Quantity: " + quantity;
    }
}
