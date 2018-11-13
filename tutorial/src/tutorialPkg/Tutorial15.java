package tutorialPkg;

public class Tutorial15 {
	
	public static void isSingleDigit(int x) { // This is a public static void which has a variable called isSingleDigit 
		 boolean b; // This is a boolean which has a variable called b
	       if (x > 1 && x < 100){ // This is saying if x is going to be greater than x and x would be less than 100
	          b=true;// This would say true if the if statement is true  
	       }else{ // This would go here if it did not meet the else statement
	          b=false;} // This would say false if the if statement is incorrect
	}
	public static void main(String[] args) { // This help runs everything in the code
		isSingleDigit(100); // This is calling the variable isSingleDigit
	
	}

}
