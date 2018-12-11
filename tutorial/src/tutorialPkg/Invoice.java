package tutorialPkg;
import java.util.ArrayList;
public class Invoice {

	private Customer theCustomer;
	private ArrayList<LineItem> Item = new ArrayList<>();
	double amountDue = 0;
	//
	public Invoice(Customer theCustomer) {
		this.theCustomer = theCustomer;
		
		
	}//end inVoice
	
	public Customer getTheCustomer() {
		return theCustomer;
		
	}//end Customer
	public void addToOrder(Product theProduct, int qty) {
		Item.add(new LineItem(theProduct, qty));
		
	}
	
	public void printInvoice() {
		System.out.println("Products: ");
		for(int i = 0; i< Item.size(); i++) {
			System.out.printf(Item.get(i) + " Total $%.2f", (Item.get(i).getTheProduct().getPrice()* Item.get(i).getQty()));
			System.out.println();
			
		}
		
		if(amountDue() <= theCustomer.getEvilFunds()) {
			System.out.println("Order has been approved!");
			
		}
		else {
			double fundShortage = theCustomer.getEvilFunds() - amountDue();
			fundShortage = fundShortage * -1;
			System.out.printf("You can't afford that item. You are short by $%.2f", fundShortage);
			System.out.println();
			
		}
		
			//Prints out all LineItems in the items ArrayList. 
				
		//If customer can afford the purchase also print out that order is approved or 
		//else if they can’t afford the order show how much they are short by.
	}
	
	public boolean canAfford(Customer theCustomer) {
		if(amountDue() <= theCustomer.getEvilFunds()){
			return true;

		}
		else {
			return false;
			//Returns true if customer can afford all purchase.
		}
	}
	
	public double amountDue() {
		double totalPrice = 0;
		for(int i = 0; i < Item.size(); i++) {
			totalPrice = totalPrice + Item.get(i).getTheProduct().getPrice() * Item.get(i).getQty();
		}
		return totalPrice;
		//returns the total amount due for this order
	}
}
