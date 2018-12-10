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
		Item.add(new LineItem(theProduct, qty));
		
	}
	
	public void printInvoice() {
		for(int i = 0; i< Item.size(); i++) {
			System.out.println(Item.get(i) + "Total $%.2f", (Item.get(i).getTheProduct().getPrice()* Item.get(i).getQty());
		}
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
