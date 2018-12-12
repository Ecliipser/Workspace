package tutorialPkg;
import java.util.ArrayList;
public class Invoice {

	private Customer theCustomer;//instance variable for Customer
	private ArrayList<LineItem> Item = new ArrayList<>();//instance variable which arraylist is holding items and quantities
	
	/**
	 * 
	 * @param theCustomer - used for invoice
	 */
	public Invoice(Customer theCustomer) {
		this.theCustomer = theCustomer;
		
		
	}//end inVoice
	/**
	 * 
	 * @return theCustomer - 
	 */
	public Customer getTheCustomer() {
		return theCustomer;
		
	}//end Customer
	/**
	 * adds a product in the customer's order
	 * @param theProduct - Product is being added to the order
	 * @param qty - amount that the customer wants to buy
	 */
	public void addToOrder(Product theProduct, int qty) {//adds items to the arraylist
		Item.add(new LineItem(theProduct, qty));
		
	}
	/**
	 * This prints out the total price for the customer and it is to see if they have enough funds to buy their products
	 */
	public void printInvoice() {//this prints out the total price for the customer and and see if they can afford the items or not
		System.out.println("Products: ");
		for(int i = 0; i< Item.size(); i++) {
			System.out.printf(Item.get(i) + " Total $%.2f", (Item.get(i).getTheProduct().getPrice()* Item.get(i).getQty()));
			System.out.println();
			
		}//end for
		
		if(amountDue() <= theCustomer.getEvilFunds()) {// if amountDue is less than or equal to theCustomer's evilFunds, this means that they can afford it
			System.out.println("Order has been approved!");// prints out that the customer's order has been approved
			
		}//end if
		else {
			double fundShortage = theCustomer.getEvilFunds() - amountDue(); //calculates to see if customers funds are short
			fundShortage = fundShortage * -1;//converts negative to positive
			System.out.printf("You can't afford that item. You are short by $%.2f", fundShortage);//tells customer that they are short in a certain amount that's rounded into 2 decimal places
			System.out.println();
			
		}//end else
		
	
	}
	/**
	 * This checks if the customer can afford their order
	 * @param theCustomer - Customer and their order
	 * @return - true if customer can afford their order or false if they can't afford it
	 */
	public boolean canAfford(Customer theCustomer) {//this checks if customer can afford their order in the arrayList
		if(amountDue() <= theCustomer.getEvilFunds()){ //This checks to see if the amountDue is less than or equal to the customer's funds, 
			return true;

		}//end if
		else {
			return false;
			//Returns true if customer can afford all purchase.
		}//end else
	}//end canAfford
	
	/**
	 * This calculates the totalPrice for the customer
	 * @return - the totalPrice of their order
	 */
	public double amountDue() {//returns the totalPrice to customer
		double totalPrice = 0;
		for(int i = 0; i < Item.size(); i++) { //this for loop has the totalPrice multiply with the quantity and it is being added to the current totalPrice
			totalPrice = totalPrice + Item.get(i).getTheProduct().getPrice() * Item.get(i).getQty();
			
		}//end for
		
		return totalPrice;
		
	}//end amountDue
}
