package purchase_tracker_v0;

public class InventoryItem {

	private String name = "Unknown";
	private int sku = 404;
	private double price = 0;
	private int quantity = 0;
	// Add other fields as needed

	// No SKU Constructor
	public InventoryItem(String name, double price, int quantity) {
		this.name = name;
		sku = 0;
		this.price = price;
		this.quantity = quantity;
	}

	// Main Constructor
	public InventoryItem(String name, int sku, double price, int quantity) {
		this.sku = sku;
		this.price = price;
		this.quantity = quantity;
	}

	// Getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// toString method for easier display
	@Override
	public String toString() {
		return "SKU: " + sku + ", Price: " + price + ", Quantity: " + quantity;
	}
}

