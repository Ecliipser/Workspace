package tutorialPkg;

/**
 * @author Marcl4
 *
 */
public class Customer {

	private String name;
	private String Location;
	private double evilFunds;
	
	
	public Customer() {
		name = "null";
		Location = " ";
		evilFunds = 0;
		
	
	}
	public Customer(String  Location, String name, double evilFunds) {
		this.Location = Location;
		this.name = name;
		this.evilFunds = evilFunds;
		
		
	}
	
	public String toString() {
		return "Location: " + Location + " Name: " + name +  " evilFunds: " + evilFunds;
	
	}
	//add funds to customers evilfunds
	public void addFunds(double addFunds) {
		evilFunds += addFunds;
	}
	public void setEvilFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}
	
	public double getEvilFunds() {
		return evilFunds;
	}
}
