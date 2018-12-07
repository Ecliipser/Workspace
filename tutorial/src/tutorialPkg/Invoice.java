package tutorialPkg;
import java.util.ArrayList;
public class Invoice {

	private Customer theCustomer;
	private ArrayList<LineItem> Item = new ArrayList<>();
	double amountDue = 0;
	//
	public Invoice(Customer theCustomer) {
		this.theCustomer = theCustomer;
		
		
	}
	
	public Customer getTheCustomer() {
		return theCustomer;
		
	}
	public void addToOrder(Product theProduct, int qty) {
		LineItem L1 = new LineItem(theProduct, qty);
		Item.add(L1);
		
	}
	
	public void printInvoice() {
		//Prints out all LineItems in the items ArrayList. 
		//If customer can afford the purchase also print out that order is approved or 
		//else if they can’t afford the order show how much they are short by.
	}
	
	public boolean canAfford(Customer theCustomer) {
		return true;
		//Returns true if customer can afford all purchase.
	}
	
	public double amountDue() {
		return amountDue();
		//returns the total amount due for this order
	}
}
