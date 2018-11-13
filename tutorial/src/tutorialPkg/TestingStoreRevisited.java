package tutorialPkg;
import java.util.Scanner;//imports scanner
public class TestingStoreRevisited {
	public static double finalPrice = 0;// checks the final price
	public static void main(String[] args) {//helps run everything in the code

		Scanner sW = new Scanner(System.in);//scans words
		Scanner sN = new Scanner(System.in);//scans numbers
		
		double secretDiscount = 0; //secret discount, will be updated if user inputs "-1" on product choice
		String[] Products = {"Cupcakes","Muffins","Space Cake","Cake","Donuts","Bag of Sugar","Lemon Meringue Pie","Croissant","Pancakes","Cookies"}; //array of product choices
		double[] Prices = {2.5, 1.25, 6.72, 14, 2, 45, 1, 3, 1.25, 9}; //prices of products
		 int[] Quantities = {0,0,0,0,0,0,0,0,0,0}; //qty of products bought
		int shopLoop; //used to put product choice back up if user wants to buy more items
		
		do { //runs the code inside brackets as long as the while statement is not fulfilled
		for(int i = 0; i < Products.length; i++) { //lists all products w/ their prices
		System.out.println(i + ". " + Products[i] + " $" + Prices[i]); //prints menu of products and their prices
		}//end for
		
		System.out.println();//spaces
		System.out.println("Please enter the number of the product you want to purchase.\n"
				+ "Product number: "); //tells user to type in the number of the product they would like to buy
		int productChoice = sN.nextInt(); //user input updates productChoice
		if(productChoice == -1) { //unlocks secret discount
			secretDiscount = 0.10; //sets secret discount to 0.10
			System.out.println("Secret discount is now being used."); //tells user that the secret discount is now in effect for the products they buy
		}//end if
		
		if(productChoice != -1) { //if product choice is not -1 continue
		System.out.println("How many of the product: " + Products[productChoice] + ", would you like to buy?\n"
				+ "Quantity: "); //asks user how much of the product they would like to buy
		int qty = sN.nextInt(); //user input updates qty
		Quantities[productChoice] = qty; //stores qty value inside the specified index of the quantities array
		}//end if
		
		System.out.println("Would you like to continue shopping? \n1 = Yes\n2 = No\n"
				+ "Answer: "); //asks user if they want to continue shopping
		shopLoop = sN.nextInt(); //user input updates shopLoop
		
		} while(shopLoop != 2); //while user continues to not input 2 (to exit shopping), it will run all the code inside the "do"
		for(int i = 0; i < Products.length; i++) { //bill shown after all user exits shop
			if(Quantities[i] > 0) { //if user bought more than 0 of the product continue
				double totalPrice = Prices[i] * Quantities[i]; //calculates sum of price
				finalPrice += Prices[i] * Quantities[i];//calculates final price
				if(secretDiscount == 0.10) { //if they used the secret discount continue
					double discount = totalPrice * secretDiscount; //multiples total price by discount
					totalPrice = totalPrice - discount; //updates price, subtracts price by discount value
					finalPrice = finalPrice - discount;//checks final price
				}//end if
				System.out.println("Product: " + Products[i] + " Price: $" + Prices[i] + " Num Bought: " + Quantities[i] + " Total: $" + totalPrice);//displays bill
			}//end if 
		}//end for
		System.out.println("Final Price: $" + finalPrice);//prints out final price



	}//end main

}
