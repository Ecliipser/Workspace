package tutorialPkg;

public class Tutorial13 {

	public static int yearsTilOneMillion(double initialBalance) {
		double percentage = initialBalance / 100 * 5; // This takes the variable initialBalance which is getting divided by 100 and multiplied by 5
		int years = 0; // This defines the variable years which has a value of 0
		while(initialBalance < 1000000) { // This while statement checks if the initialBalance is less than 1000000
			initialBalance = initialBalance * percentage; // This variable initialBalance has a value of initialBalance which is being multiplied to percentage
			years = years + 1; // This variable years has a value of years which is being added to 1
		} return years; // This returns the years variable
		
	}
	
	
	
	public static void main(String[] args) { // This helps run everything in the code
		double balanceInitial = 50.00; // This balanceInitial is a variable which has a value of 50.00
		System.out.println(yearsTilOneMillion(balanceInitial)); // This prints out the balanceInitial

	}

}
