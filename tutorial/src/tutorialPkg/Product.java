package tutorialPkg;

public class Product {

	private String name;
	private double price;
	
	public Product() {
		name = "null";
		price = 0;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Name: " + name + "price: $" + price;
	}
}
