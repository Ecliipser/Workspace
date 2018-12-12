package tutorialPkg;


public class Customer {

	private String name;//Instance variable for customer's name
	private String Location;//Instance variable for customer's location
	private double evilFunds;//Instance variable for customer's evilFunds
	
	/**
	 * Constructor for customer
	 */
	public Customer() {//sets blank values for the customer method
		name = "null";
		Location = " ";
		evilFunds = 0;
		
	
	}
	
	/**
	 * Constructor for customer
	 * @param Location - Location for customer
	 * @param name - Name of customer
	 * @param evilFunds - amount of evilFunds customer has
	 */
	public Customer(String  Location, String name, double evilFunds) {// fills the variable with values from parameter
		this.Location = Location;
		this.name = name;
		this.evilFunds = evilFunds;
		
		
	}
	
	public String toString() {//returns values for all the variables from customer method
		return "Location: " + Location + " Name: " + name +  " evilFunds: " + evilFunds;
	
	}
	/**
	 * 
	 * @param addFunds - funds being added to evilFunds
	 */
	public void addFunds(double addFunds) {//adds funds to evilFunds
		evilFunds += addFunds;
	}//end addFunds
	
	
	public double getEvilFunds() {// return value for evilFunds
		return evilFunds;
	}//end getEvilFunds
}
