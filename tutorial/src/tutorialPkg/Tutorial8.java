package tutorialPkg;

public class Tutorial8 {


public static String nametagText(String name) { //This public static string nametagText takes the string value
		return("Hello my name is " + name); //This returns a string with the inputed string value
		
		
		
		
		
		
	}
	public static void main(String[] args) { // This help runs everything in the code
		String name = ("Marc"); // This is a string which the variable is name which has a value which is "Marc"
		String nameTag = nametagText(name); // This is a string which has the variable nameTag which the nametagText is put together with the string variable name
		System.out.println(nameTag); //This prints out the nameTag

	}

}
