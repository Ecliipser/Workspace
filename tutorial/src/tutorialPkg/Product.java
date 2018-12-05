package tutorialPkg;

public class Product {

	private String name;
	private double price;
	
	public Product() {
		name = " ";
		price = 0;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return "Name: " + name + "price: " + price;
	}
}
