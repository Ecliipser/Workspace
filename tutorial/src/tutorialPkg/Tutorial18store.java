package tutorialPkg;
import java.util.Scanner;//Imports utility scanner
public class Tutorial18store {
	//global variables 
	static double price = 0; //total price of sale
	static final double TAX = 0.05; //tax for price
	static int totalQty = 0;//accumulator - counter
	static int karaQty = 0;//karambit qty
	static int butterflyQty = 0;//butterfly knife qty
	static int foldingQty = 0;//folding knife qty
	static int campingQty = 0;//camping knife qty
	static int bowieQty = 0;//bowie knife qty
	static int daggerQty = 0;//dagger qty
	static int flipQty = 0;//flip knife qty
	// Guns or Knife
	// Sell:
	// Karambit
	// Butterfly Knife
	// Folding Knife
	// Camping Knife
	// Bowie Knife
	// Dagger
	// Flip Knife
	//
	
	public static void menu() { //public static void which has a variable called menu
		Scanner scanWords = new Scanner(System.in); //scanner object to take in words
		Scanner scanNums = new Scanner(System.in); //scanner object to take in nums
		
		double karambitPrice = 50; //price of the karambit
		double butterflyKnifePrice = 70; //price of butterfly knife
		double foldingKnifePrice = 90; //price of folding knife 
		double campingKnifePrice = 60; //price of camping knife
		double bowieKnifePrice = 100; //price bowie knife
		double daggerPrice = 120; //price of dagger
		double flipKnifePrice = 105; // price of flip knife
		int itemNum;// Calls variable itemNum
			
		System.out.print("What is your name?: " ); //prompt user to enter name
		String name = scanWords.nextLine(); //declare name variable and store input
		
		System.out.println("\nWelcome " + name + " to Francis' Knife store!"); // prints out name of user and welcomes them to the store
		
	do { //keeps looping menu	
		System.out.println("\nWhat would you like to buy?\n"// prompts user to pick what they want to buy
				+ "0. Exit\n"
				+ "1. Karambit price: $50\n" 
				+ "2. Butterfly Knife price: $70\n" 
				+ "3. Folding Knife price: $90\n" 
				+ "4. Camping Knife price: $60\n" 
				+ "5. Bowie Knife price: $100\n"
				+ "6. Flip Knife price: $120\n"
				+ "7. Dagger price: $105\n"
				+ "Knife option:");
		
		itemNum = scanNums.nextInt(); // Calls the variable itemNum which has scanNum.nextInt as its value
		if(itemNum != 0) { //If itemNum does not equal 0
		System.out.println("How many do you want?\n"
					+ "Quantity: "); //this prints out to the user how many items do they want
		
		int qty = scanNums.nextInt(); //calls the variable qty which has scanNums.nextInt for its value
		totalQty += qty; //Total qty
		
		
		if(itemNum == 1) { //This if statement is if the user picks option 1
			price += calcCost(karambitPrice, qty); //This is a price variable is being called that the karambitPrice is going to be multiplied to how many the user wants which is the quantity
			karaQty += qty; //total karambit qty
		}
		else if(itemNum == 2) { //This else if statement is here if the user picks option 2
			price += calcCost(butterflyKnifePrice, qty);//This is a price variable is being called that the butterflyKnifePrice is going to be multiplied to how many the user wants
			butterflyQty += qty;//total butterfly knife qty
		}
		else if(itemNum == 3) {//This else if statement is here if the user picks option 3
			price += calcCost(foldingKnifePrice, qty);//This is a price variable that is being called that the foldingKnifePrice is going to be multiplied to how many the user want which is the quantity
			foldingQty += qty;//total folding knife qty
			
		}
		else if(itemNum == 4) {//This else if statement is here if the user picks option 4
			price += calcCost(campingKnifePrice, qty);//This is a price variable that is being called that the campingKnifePrice is going to be multiplied to how many the user want which is the quantity
			campingQty+= qty;//total camping knife qty
			
		}
		else if(itemNum == 5) {//This else if statement is here if the user picks option 5
		price += calcCost(bowieKnifePrice, qty);//This is a price variable that is being called that the bowieKnifePrice is going to be multiplied to how many the user want which is the quantity
		bowieQty += qty;//total bowie knife qty
		
		}
		else if(itemNum == 6) {//This else if statement is here if the user picks option 6
			price += calcCost(flipKnifePrice, qty);//This is a price variable that is being called that the flipKnifePrice is going to be multiplied to how many the user want which is the quantity	
			flipQty+= qty;//total flip knife qty
			
		}	
		else if(itemNum == 7) {//This else if statement is here if the user picks option 7
			price += calcCost(daggerPrice, qty);//This is a price variable that is being called that the daggerPrice is going to be multiplied to how many the user want which is the quantity
			daggerQty+= qty;//total dagger qty
			
		}	
		else { //This else statement is here if the user did not meet the if or the else if statements
			System.out.println("Sorry there is no option for that");// This tells the user that there option is invalid
		}
		}//end if(itemNum != 0)
	}while(itemNum != 0); //end while
	
	printSummary(); //calls printSummary variable
	}//end menu
	public static double calcCost(double itemPrice, int qty) { //public static double which calculates cost of itemprice and qty
		return itemPrice * 0.8 * qty; // returns itemprice which is multiplied by sale and qty
	}//end calcCost
	public static double calcTax(double TAX, double price) { //public static double which calculates tax of price
		return TAX * price; //returns tax multiplied with price
		
	}//end calcTAX
	public static void printSummary() { //public static void of printSummary
		System.out.println("Total items sold: " + totalQty);//Tells user total items sold
		System.out.println("Total Karambits sold: " + karaQty);//Tells user total karambit sold
		System.out.println("Total butterfly knife sold: " + butterflyQty);//Tells user total butterfly knife sold
		System.out.println("Total Folding knife sold " + foldingQty);//Tells user total folding knife sold
		System.out.println("Total Camping knife sold " + campingQty);//Tells user total camping knife sold
		System.out.println("Total Bowie knife sold " + bowieQty);//Tells user total bowie knife sold 
		System.out.println("Total Flip knife sold " + flipQty); //Tells user total flip knife sold 
		System.out.println("Total Dagger sold " + daggerQty); //Tells user total dagger sold
		System.out.println("Your total is $" + price); //This tells the user the total price
		
		// System.out.println("Tax is: " + calcTax(TAX,price));
		System.out.printf("Tax is: %.2f \n", calcTax(TAX,price)); // prints out the price with the tax
		
		double totalPrice = calcTax(TAX,price) + price; //price multiplied with tax plus price is added again with tax
		System.out.printf("Total with tax is: %.2f \n", totalPrice); //prints out total price
		
		System.out.println("Thanks for shopping, stay safe with your knife");//This tells the user that they are done buying things in the store
	}//end printSum
	public static void main(String[] args) {//Helps run everything in the code
		menu(); // Calls menu variable
		
	}//end main
}

