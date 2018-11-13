package tutorialPkg;

public class Tutorial9 {
	
	public static double FarentoCel(double temp) // This public static double which has a variable FarentoCel which has a value of double temp
	{
		double faren = temp; // The double defines faren and it has a value of temp
		double cel = (faren - 32) * 5/9; // This double defines cel which faren is subtracted first then multiplied with 5/9
		return cel; // This returns the variable cell
	}
		
	public static void printTemp(double temp) // This public static void has a variable called printTemp which has a value of double temp
	{
		double faren = temp; // This double defines faren and it has a variable called temp
		System.out.println("F:" + faren); // This prints out the farenheit
		
		double cel = FarentoCel(faren); // This double defines the variable cel and it has a value of FarentoCel with faren
		System.out.println("C:" + cel); // This prints out the celsius
		
	}
	
	public static void main(String[] args) { // This runs everything in the code
		printTemp(50); // This calls the variable printTemp which has a value of 50
		
	}

}
