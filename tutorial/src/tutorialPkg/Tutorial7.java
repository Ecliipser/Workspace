package tutorialPkg;

public class Tutorial7 {

	public static double calculateTip(double x) { // This calls the public variable calculateTip
		double mealCost= x * 0.15; // This variable mealCost has a value that is being multiplied with 0.15
		return mealCost; // This is returning the variable mealCost	
		
	}
	public static void main(String[] args) { // This runs everything in the code

calculateTip(100); // This is calling the variable calculateTip which has a value of 100
System.out.println(calculateTip(100)); // This prints out the value of calculateTip

	
	

	}

}

