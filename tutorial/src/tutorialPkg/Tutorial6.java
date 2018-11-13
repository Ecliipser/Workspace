package tutorialPkg;

public class Tutorial6 {

public static double absoluteValue(double x) { // This calls the public variable absoluteValue
	if(x < 0) { // This if statement tells us if the value in x is less than 0
		return -x; // This will return x if it is less than 0
	} else { // This will go to the else statement if it does not meet the if statement
		return x; // This will return x if it is greater than 0
	}
}	
	
	public static void main(String[] args) { // This helps run everything in the code
		
absoluteValue(7); // This is calling the variable absoluteValue which has a value of 7
System.out.println(absoluteValue(7)); // This will print out the absoluteValue whatever value it has
	


	}

}
