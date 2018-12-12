package tutorialPkg;

public class Product {

	private String name;//Instance variable for the product's name
	private double price;//Instance variable for the product's price
	
	/**
	 * Constructor for product to set original value
	 */
	public Product() {//sets original value for product method
		name = "null";
		price = 0;
	}//end original product
	
	/**
	 * Constructor so that the variable has values using the parameter values
	 * @param name - name of Product
	 * @param price - price of Product
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	/**
	 * prints the price of the product
	 * @return - value for price
	 */
	public double getPrice() {//returns value for price
		return price;
	}

	public String toString() {//returns value for all variables
		return "Name: " + name + "price: $" + price;
	}
}
