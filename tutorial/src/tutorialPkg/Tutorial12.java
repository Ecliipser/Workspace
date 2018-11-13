package tutorialPkg;

public class Tutorial12 {

	public static int factorial (int n) { // This is a public static int which has a variable called factorial which has a value of n which is being called
		int x = 1; // This defines the variable x which has a value of 1
		int y = 1; // This defines the variable y which has a value of 1
		
		while (x <= n) { // This while statement is saying that if x is less than or equal to n
			y = y * x; // This string which has a variable y has a value which is y and it is being multiplied to n
			x = x + 1; // This string which has a variably x has a value which is x and it is being added to 1
		}return y; // This returns the y variable
		
	}
	public static void main(String[] args) { // This helps run everything in the code
		int number = 5; // This defines the variable number which has a value of 5
		System.out.println(factorial(number)); // This prints out the factorial number
		
	
		}


	}//end main


