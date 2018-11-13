package tutorialPkg;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	public static void yearGuessGame() {

		System.out.println("Welcome to our guessing game!");
		String name;
		System.out.println("What's your name?: ");
		name = scan.nextLine();
		System.out.println("Welcome " + name + " to  Jigsaw's Family Friendly Games");
		System.out.println(" Would you like to play?\n 1. yes\n 2. no\n");
		
		int choice1 = scan.nextInt();
		if(choice1 == 1)		{
			System.out.println("Starting to generate your numbers");
			int year = rand.nextInt(2018) + 1;
			System.out.println("The year has been generated! Your first tip is the number is between 1976 - 2018");
			int guess = scan.nextInt();
			int counterLoss = 0;
			do {
				if(guess < year) {
					counterLoss = counterLoss + 1;
					System.out.println("Guess Again. Hint: Your guess is less than the year");
					guess = scan.nextInt();
					
				}//end if
				else if(guess > year) {
					counterLoss = counterLoss + 1;
					System.out.println("Guess again. You guess is higher than the year");
					guess = scan.nextInt();
					
				}//end else if
				else if(guess == year) {
					System.out.println("You got it right!");
					System.out.println("Would you like to play again? 1. Yes\n 2. No\n ");
					int choice2 = scan.nextInt();
					if(choice2 == 1) {
						yearGuessGame();
				}//end if choice2
							

			}while(counterLoss != 10) {
				System.out.println("You Lose");
				System.out.println("The year you were guessing was " + year);
				System.out.println("Would you like to play again? 1. Yes\n 2. No\n");
				int choice3 = scan.nextInt();
				if(choice3 == 1) {
					yearGuessGame();
				}//end else if
			}

		
			else{
				System.out.println("Thanks for playing"); 
			}
			{
			
		
	
		
			
		

			
				
			
			
				
		
			
			
		
		
	
	//end guessing game
	public static void main(String[] args) {
		yearGuessGame();

	}

}
