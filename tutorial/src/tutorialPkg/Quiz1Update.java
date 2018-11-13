package tutorialPkg;

public class Quiz1Update {

	public static boolean isSingleDigit(int number) { //the main variable, isSingleDigit is on a loop and returns
		if(number >= -9 && number <= 9) { //this is saying that if the number variable is greater than or equal to -9 or if number is less than or equal to 9
			return true;//it will return true if the if statement is true
		}//end if
		else {//it will go here if the if statement was not met
			return false;//it will return false if the if statement was not met
		}//end else
	}//end public static boolean isSingleDigit(int number)
	
	
	
	public static void main(String[] args) {//Helps run everything in the code
		System.out.println(isSingleDigit(4));//prints out number as 4
		System.out.println(isSingleDigit(45));//prints out number as 45
		System.out.println(isSingleDigit(-3));// prints out number as -3
		

	}//end public static void main

}//end public class Quiz1Update
