package tutorialPkg;
import java.util.Random;
public class Testing {

	public static int monopolyRoll() { // This is a public static int which has a variable called monopolyRoll
		Random rand = new Random(); // A random function that makes the values random
		int n1 = rand.nextInt(6) + 1; //rand.nextInt creates a random number between a set parameter (in this case being 1 to 6)
		int n2 = rand.nextInt(6) + 1;	//rand.nextInt creates a random number between a set parameter 
		int n3; // This defines the variable n3
		int n4; // This defines the variable n4
		int n5; // This defines the variable n5
		int n6; // This defines the variable n6
		int numHold2 = 0; // This defines the variable numHold2 which has a value of 0
		int numHold1 = 0; // This defines the variable numHold1 which has a value of 0
		if (n1 == n2) { //If statement that checks if num1 is equal to num2
			n3 = rand.nextInt(6) + 1; // This n3 variable has a value which is rand.nextInt which is being added to 1 and it also creates a random number between a set of parameter (in this case being 1 to 6)
			n4 = rand.nextInt(6) + 1; // This n4 variable has a value which is rand.nextInt which is being added to 1  and it also creates a random number between a set of parameter (in this case being 1 to 6)
			if (n3 == n4) { //If statement that checks if num3 is equal to num4
				n5 = rand.nextInt(6) + 1;  // This n5 variable has a value which is rand.nextInt which is being added to 1  and it also creates a random number between a set of parameter (in this case being 1 to 6)
				n6 = rand.nextInt(6) + 1;  // This n6 variable has a value which is rand.nextInt which is being added to 1  and it also creates a random number between a set of parameter (in this case being 1 to 6)
				while (n5 == n6) { //While statement that continues to run while the "rolled" values of num5 and num6 are the same
					numHold1 = numHold1 + n5; // The variable numHold1 has a value of numHold1 which is being added to n5
					numHold2 = numHold2 + n6; // The variable numHold2 has a value of numHold2 which is being added to n6
					n5 = rand.nextInt(6) + 1;  // This n5 variable has a value which is rand.nextInt which is being added to 1  and it also creates a random number between a set of parameter (in this case being 1 to 6)
					n6 = rand.nextInt(6) + 1;}  // This n6 variable has a value which is rand.nextInt which is being added to 1  and it also creates a random number between a set of parameter (in this case being 1 to 6)
				return n1 + n2 + n3 + n4 + numHold1 + numHold2; // This returns all the variables that was being used
			}else { // This else statement is here if it did not meet the if statement
				return n1 + n2 + n3 + n4; // This returns all the variables that was being used
			}
		}else { // This else statement is here if it did not meet the if or the other else statement
			return n1 + n2;} // This returns the variables that was being used
		}


	 	



	public static void main(String[] args) {
		System.out.println(monopolyRoll()); //Prints out the value returned by the "monopolyRoll" function

	


	}

}
