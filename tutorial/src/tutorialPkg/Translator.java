package tutorialPkg;
import java.util.Scanner;
public class Translator {

	static Scanner scan = new Scanner(System.in); // Global scanner
	static String choice = ""; // Global choice that can be used for everything 
	public static void translatorOption() { // The main translator option 

		System.out.println("What would you like to translate?: \n"
				+ "1. English to Basque\n"
				+ "2. Basque to English\n"
				+ "Answer: "); // Prints out the the message and the options
		int userchoice = scan.nextInt(); // Scans the users choice 
		if(userchoice == 1){ // The first choice
		englishToBasque(); // This changes the English words to the Basque words 
		}//end if
		
		else if(userchoice == 2){ // The second choice
			basqueToEnglish(); // This changes the Basque words into English words
			
		}//end else if
		else { // If the user didn't meet the if and else statements
			System.out.println("You entered an invalid number please enter between 1 and 2 only "); // This prints out the message 
			
		}//end else
		
	}//end translatorOption


	public static void englishToBasque() { // The translation from English to Basque
	String[] English = {"Hello","Good Bye","Good Morning","Good Night","Have a nice day","Good luck","Be safe",
			"Take care","Have fun","Book","Car","Let's play","Call me","Send it","I'm Hungry"}; // This stores the English words 
	
	String[] Basque = {"Kaixo","Agur","Egun On","gau ona", "Egun ona izan","Zorte On","Seguru Egon","Kontuz ibili","Ondo pasa",
			"Liburu","Autoa","Jolas dezagun","Deitu iezadazu","Bidali ezazu","gose naiz"}; // This stores the Basque words
	
	for(int i = 0; i < English.length; i++) { // It lists all the English words that can be translated to Basque
		System.out.println("English words: " + English[i]); // Prints out all the English words
	}//end for 
	System.out.println("What english word would you like to translate to Basque?: "); // prints out what Englis word you would like to translate to Basque
	scan.nextLine(); // Scans the next line
	choice = scan.nextLine(); // It scans the users input
	for(int i = 0; i < English.length; i++) { // It checks every word, when it's found it prints out the word
	boolean foundorNot = false; // Checks the word has been found and translated 
	do { // It does everything inside the brackets
		if(choice.equalsIgnoreCase(English[i])) { // Looks at each index for the chosen word of the English array
			foundorNot = true; //string variable that has a value of true
			if(foundorNot == true) { // It's set to continue
				System.out.println("English: " + English[i] + "\nBasque: " + Basque[i]); // Prints the English: " + English[i] + "\nBasque: " + Basque[i]
			}//end if founderNot == true
		}//end if choice English
		i++; // It adds 1 to the i variable
	} while(i != English.length); // 
	if(foundorNot == false) { // If the foundorNot is set to false than it does not continues
		System.out.println("Invalid word. Returning to Translator Option."); // Prints out the message
		translatorOption(); // Calls the translatorOption
		}//end if
	}//end for loop
	System.out.println(); // Used for spacing
	
	System.out.println("Would you like to continue translating? \n1. Yes\n2 No"); // Prints out if you would want to continue to translate and gives options of yes and no
	int numchoice = scan.nextInt(); // It stores the user numchoice input
	if(numchoice == 1) { // If the users inputs 1 than this continues
		System.out.println("Returning to translator option"); // It prints out "Returning to translator option"
		translatorOption(); // Calls the translatorOption
	}//end if
	else { // If the user has inputed anything other than 1 this will 
		System.out.println("Exiting..."); // Prints out "Exiting..."
		System.exit(-1); // Exits program
	}//end else
	}//end englishtoBasque
	
	public static void basqueToEnglish() { // The translation from Basque to English

		String[] English = {"Hello","Goodbye" ,"Good Morning","Good Night","Have a nice day" ,"Good luck","Be safe",
				"Take care","Have fun","Book","Car","Let's play","Call me","Send it","I'm Hungry"}; // It stores the English words
		
		String[] Basque = {"Kaixo","Agur","Egun On","gau ona","Egun ona izan","Zorte On","Seguru Egon","Kontuz ibili","Ondo pasa",
				"Liburu","Autoa","Jolas dezagun","Deitu iezadazu","Bidali ezazu","gose naiz"}; // It stores the Basque words
		for(int i = 0; i < Basque.length; i++) { // It lists all the Basque words that is translatable to English
			System.out.println("Basque words: " + Basque[i]); // //prints out the Basque words for user
		}//end for 
		System.out.println("What Basque word would you like to translate to English?: ");//asks user what basque word they would like to translate to english
		scan.nextLine();//scans users input
		choice = scan.nextLine();//scans what word they have translated
		
		for(int i = 0; i < Basque.length; i++) {//checks Basque length
			boolean foundorNot = false;// Checks the word if it has been found and translated 
			do {//runs everything inside the bracket
				if(choice.equalsIgnoreCase(Basque[i])) {//ignores if user input lower case or upper case
					foundorNot = true;//string variable that has a value of true
					if(foundorNot == true) {// It's set to continue
						System.out.println("Basque: " + Basque[i] + "\nEnglish: " + English[i]);//prints out Basque word and translates it to English
					}//end if founderNot == true
				}//end if choice English
				i++;//adds 1 to the i variable
			} while(i != Basque.length);//loop to see if array does not equal the Basque word
			if(foundorNot == false) {// If the foundorNot is set to false than it does not continue
				System.out.println("Invalid word. Returning to Translator Option.");//User put in an invalid word
				translatorOption();//goes to translatorOption again
				}//end if
		}//end for
		System.out.println();//spaces
		
		System.out.println("Would you like to continue translating? \n1. Yes\n2. No");//asks user if they want to continue to translate
		int numchoice = scan.nextInt();//takes in users number choice
		if(numchoice == 1) {//if statement if user picked choice 1
			System.out.println("Returning to translator option");//tells user that it's returning to translator option
			translatorOption();//returns to translatorOption
		}//end if
		else {//else statement is here if user didn't meet if statement
			System.out.println("Exiting...");//tells user that it's exiting
			System.exit(-1); // Exits program
		}//end else
		}//end basqueToEnglish
	public static void main(String[] args) {//helps run everything in the code
		translatorOption();//Runs translatorOption
		
		
		
		
		}//end main

	}


