package tutorialPkg;

import java.util.Scanner;
import java.util.Random;

public class Tutorial1 {
	/**
	 * It calculates circumference given a radius
	 * @param radius - a double that represents the radius
	 * @return  - the circumference of a circle
	 */
	public static double circumference(double radius) {
		
		//double diameter = 2* radius;
		double circumference =  2 * Math.PI * radius;
		
		return circumference;
	
	}
		
	public static int areaOfRectangle(int 1, int w) {
		return 1 * w;
	}
	
	public static void printName() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Hi Marc");
		}
		
		
	}

	public static void main(String[] args) {
		int varNum1;
		varNum1 = 10;
		
		int varNum2 = 25;
		
		int varNum3;
		varNum3 = varNum1 + varNum2;
		
		System.out.print(varNum3);
		System.out.println(varNum2);
		System.out.println(varNum1);
		
		printName();
		
if (varNum3 > 5) {
	System.out.println("greater");
		}

else if (varNum3 > 6)
	System.out.println("Bigger than 6");
else
	System.out.println("less");

	String inData;
	Scanner scan = new Scanner( System.in );
	
	System.out.println("Enter the data:");
	inData = scan.nextLine();
	
	System.out.println("You entered:" +  inData);
	
	int num;
	int square;
	System.out.println("Enter an integer:");
	num = scan.nextInt();
	square = num * num ; // compute the square
	
	System.out.println("The square of " + num + " is " + square);
	
	Random rand = new Random();
	
	int randomNum = rand.nextInt(11) + 5;
	
	System.out.println(randomNum);
	
	int bankBalance1; 
	bankBalance1 = 500;
	
	int bankBalance2 = 250;
	
	int bankBalance3;
	bankBalance3 = 100;
	
	int bankBalance4;
	bankBalance4 = bankBalance1 + bankBalance2 - bankBalance3;
	
	System.out.print(bankBalance1);
	System.out.println(bankBalance2);
	System.out.println(bankBalance3);
	System.out.println(bankBalance4);
	
	double r = 4.6;
	double c = circumference(r); // r is the argument
	
	System.out.println("ciercumference is:" + c);
	
	int 1 = 4;
	int w = 10;
	
	System.out.println("area is: " + areaofRectangle(1,w));
	}//end main

}//end class
