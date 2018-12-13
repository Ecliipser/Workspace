package Invoice;

public class LineItem {

	private int qty;//instance variable which is the amount of the products being bought
	private Product theProduct;//instance variable which the product is being bought by the customer
	
	/**
	 * Constructor for LineItem and has original value
	 */
	public LineItem() {//sets original value for LineItem method
		qty = 0;
	}
	/**
	 * Constructor for LineItem, fills variables with parameter values
	 * @param theProduct - the product being bought by customer
	 * @param qty - amount of product being bought by customer
	 */
	public LineItem(Product theProduct, int qty) {//sets values for variables using the parameter values
		this.qty = qty;
		this.theProduct = theProduct;
	}
	/**
	 * Prints out the amount of product
	 * @return - value for quantity
	 */
	public int getQty() {//returns quantity of the product that's being bought
		return qty;
		
	}//end getQty
	
	/**
	 * Prints out the product that's being bought by customer
	 * @return - product that's being bought by customer
	 */
	public Product getTheProduct() {//returns theProducts and the information
		return theProduct;
	}
	/**
	 * Prints the info of the product 
	 */
	public String toString() {//returns all values from the variables in LineItem method
		return "Product " + theProduct + " Quantity: " + qty;
	}
}
