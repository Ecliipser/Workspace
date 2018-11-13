package tutorialPkg;
import java.util.Scanner;
public class Assign3Store {

	
	
	
	
	public static void main(String[] args) {
		
		Scanner sW = new Scanner(System.in);
		Scanner sN = new Scanner(System.in);
		
		String[] Products = {"Cupcakes", "Muffin", "Space Cake","Cake","Donuts","Lemon Meringue Pie","Croissant","Pancakes","Cookies","Cheesecake"};
		double[] Prices = {2.5, 1.25, 6.72, 14, 2, 45, 1, 3, 1.25, 9};
		int[] Quantities = new int[Products.length];
		

		for(int i = 0; i < Products.length; i++) {
			System.out.println(i + ". "  + Products[i] + ": $" + Prices[i]);
		}//end for
		System.out.println("enter -1 to stop shopping");
		System.out.println();
		
		System.out.println("what do you want to buy? enter a number: ");
		double totalprice = 0;
		int quantities = 0;
		int product = 0;
		System.out.println(" Please enter the number of the product you would like to purchase: ");
		while(product != 1){
			product = scanNum.nextInt();
			System.out.println("How many "+ Products[product] + " would you like to buy? ");
			quantities = scanNum.nextInt();
			quantity[quantities] = quantities;
			double totalqty = Prices[product] * quantities;
			System.out.println(Products[product] + " come to $" + totalqty);
			System.out.println("Would you like to keep shopping? 2 for No or 1 for Yes? ");
			String choice = scanLine.nextLine();
			if (choice.equals("2")) {
				System.out.println("Thanks for shopping!");
				totalprice = Prices[product] * quantities;
				System.out.println(Products[product] + " total quantity: " + quantity[quantities] + " Total Price: $" + totalprice);
				break;
				

			}//end if
			else if(choice.equals("1"));
			totalprice = Prices[product] + quantities;
			System.out.println(Products[product] + " " + totalqty + " " + totalprice);

			
		}//end while
		
		
		}

	}


