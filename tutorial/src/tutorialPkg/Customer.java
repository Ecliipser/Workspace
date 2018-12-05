package tutorialPkg;

/**
 * @author Marcl4
 *
 */
public class Customer {

	private String name;
	private String secretLairLocation;
	private double evilFunds;
	
	public Customer() {
		name = " ";
		secretLairLocation = " ";
		evilFunds = 0;
	}
	public Customer(String secretLairLocation, String name, double evilFunds) {
		this.secretLairLocation = secretLairLocation;
		this.name = name;
		this.evilFunds = evilFunds;
	}
	
	public String toString() {
		return "Name:" + name + "SecretLairLocation: " + secretLairLocation + "evilFunds: " + evilFunds;
	
	}
	//add funds to customers evilfunds
	public void addFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}
}
