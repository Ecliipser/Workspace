package tutorialPkg;
import java.util.Scanner;//Imports utility scanner
public class Store1 {
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
	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in); //scanner object to take in words
		Scanner scanNums = new Scanner(System.in); //scanner object to take in nums
		
		double karambitPrice = 50; //price of the karambit
		double butterflyKnifePrice = 70; //price of butterfly knife
		double foldingKnifePrice = 90; //price of folding knife 
		double campingKnifePrice = 60; //price of camping knife
		double bowieKnifePrice = 100; //price bowie knife
		double daggerPrice = 120; //price of dagger
		double flipKnifePrice = 105; // price of flip knife
		double price = 0; //total price of sale
		final double TAX = 0.05;
		double totalCost;
			
		System.out.print("What is your name?: " ); //prompt user to enter name
		String name = scanWords.nextLine(); //declare name variable and store input
		
		System.out.println("\nWelcome " + name + " to Francis' Knife store!"); // prints out name of user and welcomes them to the store
		
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
		
		int itemNum = scanNums.nextInt(); // Calls the variable itemNum which has scanNum.nextInt as its value

		while(itemNum != 0) {
			
		System.out.println("How many do you want?\n"
						+ "Quantity: "); //this prints out to the user how many items do they want
	
		int qty = scanNums.nextInt(); //calls the variable qty which has scanNums.nextInt for its value
	
		if(itemNum == 1) { //This if statement is if the user picks option 1
			price += karambitPrice * qty + price; //This is a price variable is being called that the karambitPrice is going to be multiplied to how many the user wants which is the quantity
		
		}
		else if(itemNum == 2) { //This else if statement is here if the user picks option 2
			price += butterflyKnifePrice * qty;//This is a price variable is being called that the butterflyKnifePrice is going to be multiplied to how many the user wants
			
		}
		else if(itemNum == 3) {//This else if statement is here if the user picks option 3
			price = foldingKnifePrice * qty;//This is a price variable that is being called that the foldingKnifePrice is going to be multiplied to how many the user want which is the quantity
		}
		else if(itemNum == 4) {//This else if statement is here if the user picks option 4
			price = campingKnifePrice * qty;//This is a price variable that is being called that the campingKnifePrice is going to be multiplied to how many the user want which is the quantity
		}
		
		else if(itemNum == 5) {//This else if statement is here if the user picks option 5
		price = bowieKnifePrice * qty;//This is a price variable that is being called that the bowieKnifePrice is going to be multiplied to how many the user want which is the quantity
	
		}
		else if(itemNum == 6) {//This else if statement is here if the user picks option 6
			price = flipKnifePrice * qty;//This is a price variable that is being called that the flipKnifePrice is going to be multiplied to how many the user want which is the quantity	
	
		}	
		else if(itemNum == 7) {//This else if statement is here if the user picks option 7
			price = daggerPrice * qty;//This is a price variable that is being called that the daggerPrice is going to be multiplied to how many the user want which is the quantity
		
		}	
		else { //This else statement is here if the user did not meet the if or the else if statements
			System.out.println("Sorry there is no option for that");// This tells the user that there option is invalid
	}
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
		}//end while
			System.out.println("Your total is $" + price); //This tells the user the total price
			System.out.println("Tax is: " + price * TAX);
			double totalPrice = price * TAX + price;
			System.out.println("Total tax is: " + totalPrice);
			System.out.println("Thanks for shopping, stay safe with your knife");//This tells the user that they are done buying things in the store
	}

}
