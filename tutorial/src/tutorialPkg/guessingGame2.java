package tutorialPkg;
import java.util.Scanner; // It imports the Scanner
import java.util.Random; // It imports the Random

public class guessingGame2 {
	static Random rand = new Random(); // It gives a global random so it can be used through out the code
	static Scanner scan = new Scanner(System.in); // It gives a global scanner so it can be used through out the code with a variable called System.in
	
	public static void numberGuessGame() { // It's a public static void with a variable called numberGuessGame
		
		System.out.println("Welcome to our guessing game!"); // It prints out Welcome to our guessing game!
		String name; // It calls the variable name and stores the users name
		System.out.println("What's your name?: "); // It prints out What's your name?: 
		name = scan.nextLine(); // It scans the next line
		System.out.println("Welcome " + name + " to  Jigsaw's Family Friendly Games"); // It prints out Welcome " + name + " to  Jigsaw's Family Friendly Games 
		System.out.println(" Would you like to play?\n 1. yes\n 2. no\n "); //It prints out Would you like to play?\n 1. yes\n 2. no\n
	
		int choice1 = scan.nextInt(); // Defines the variable choice1 and equals to the scan of the next line
		if(choice1 == 1) { // if user pick choice 1
			System.out.println("Starting to generate your number"); // Computer starts to generate the number 
			int number = rand.nextInt(100) + 1; // Defines the variable number which equals to rand.nextInt(100)and it also has a value 
			System.out.println("The number has been generated! Your first tip is that the number is between 1 - 100"); // It prints The number has been generated! Your first tip is the number is between 1 - 100
			int guess = scan.nextInt(); // Defines the variable guess which equals to scan.nextInt()
			int counterLoss = 0; // Defines the variable counterLoss which equals to a value  
			
		do {// It evaluates the expression at the bottom
			if(guess < number) { // if guess is less than the number
				counterLoss = counterLoss + 1; // The number of tries 
				System.out.println("Guess again. Hint: Your guess is less than the number"); // it prints Guess Again. Hint: Your guess is less than the number
				guess = scan.nextInt(); // The user guesses a number
				
			}//end if
			
			else if(guess > number) { // else if guess is greater than number
				counterLoss = counterLoss + 1; // The number of tries
				System.out.println("Guess again. Hint: Your guess is higher than the number"); // It prints Guess again. You guess is higher than the number
				guess = scan.nextInt(); // The user guesses a number 
				
			}//end else if
			
			else if(guess == number) { // else if the guess is equal to the number
				System.out.println("WINNER WINNER CHICKEN DINNER!"); // It prints out You got it right!
				System.out.println("Would you like to play again? If not press a letter to exit the game. 1. Yes\n 2. No\n "); // It prints out Would you like to play again? 1. Yes\n 2. No\n
				int choice2 = scan.nextInt(); // puts users choice
				if(choice2 == 1) {// If user chooses choice 1
					numberGuessGame();//  Game starts playing again
			}//end if choice2
			else {// else statement if user did not meet if statement
				System.out.println("Thanks for playing");// Tells user thanks for playing
				}
			}
				
		}while(counterLoss != 10);{// if user meets 10 guesses, they lose
			System.out.println("LOSER, YOU'RE DEAD TO ME "); // It prints out LOSER, YOU'RE DEAD TO ME
			System.out.println("The number you were guessing was " + number); // It prints The year you were guessing was " + number
			System.out.println("Would you like to play again? If not press a letter to exit the game. 1. Yes\n 2. No\n"); // it prints out Would you like to play again? 1. Yes\n 2. No\n
			int choice3 = scan.nextInt();// Takes in user's choice
			
			if(choice3 == 1) { // if user picks choice 1
				numberGuessGame();// game starts again
			}//end if
		
		}
		}
	else { // if user didn't meet if statement
		System.out.println("Thanks for playing"); // prints out thanks for playing
	}
		}
		
	public static void main(String[] args) { // runs everything in the code
		numberGuessGame(); // makes the game run

	}

}
