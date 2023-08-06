public class Product {
	private double price;
	private int quantity;
	private String name;

	public Product (String initalName, double initalPrice, int initialQuantity) {
		this.name = initalName;
		this.price = initalPrice;
		this.quantity = initialQuantity;
	}

	public void printProduct() {
		System.out.println(name + ", price" + price + ", " + quantity + " pcs");
	}
	
}
