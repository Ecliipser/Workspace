package tutorialPkg;

import java.util.Random; // This imports the random utility in the code to make the random function work

public class Tutorial10 {
	/**
	*@param no parameters
	*@return returns sum of the integers
	*/
	
	public static int monopolyRoll() { // This is a public static in which has a variable called monopolyRoll
		Random rand = new Random(); // A random function that makes the values random
		int num1 = rand.nextInt(7); // Defines the variable num1 which has a value rand.nextint(7) and it is random
		int num2 = rand.nextInt(7); // Defines the variable num2 which has a value random.nextInt(7) and it is also random
		int num3; // This defines the variable num3
		int num4; // This defines the variable num4
		if(num1 == num2) { // This if statement means that if num1 and num2 are going to be equal to each other
			return num1 + num2; // This returns the variables num1 and num2
	} 
	else { // This else statement is here if the if statement is not met
			num3 = rand.nextInt(7); // This is a string which num3 is the variable and has a value which is rand.nextInt(7) and it is random
			num4 = rand.nextInt(7); // This is a string which num4 is the variable and has a value which is rand.nextInt(7) which is also random
	}return num1 + num2 + num3 + num4; // This returns all the variables after they are added together
		
		
	}

		
		
	public static void main(String[] args) { // This helps run everything in the code
		System.out.println(monopolyRoll()); // This prints out what the value is for the monopolyRoll
	}


	
	}
	


