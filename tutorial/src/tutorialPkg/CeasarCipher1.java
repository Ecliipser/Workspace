package tutorialPkg;

import java.util.Scanner;//imports Scanner


public class CeasarCipher1 {
	public static Scanner scanLine = new Scanner(System.in); //Takes in scanLine
	public static Scanner scanNum = new Scanner(System.in);// Takes in scanNum
	
	
	public static void userChoice(){ //This is for what the user chooses
		System.out.println("What do would you like to do? \n "//asks user what they want to do, encrypt or decrypt
				+ "1. Encrypt\n"
				+ "2. Decrypt\n");
		int choice = scanNum.nextInt(); //Takes in user's choice
		if(choice == 1) {//If user's choice equals to 1
			encrypt(null, choice);//This will start encrypt if they chose choice 1
		}//end if choice
		
		else if(choice == 2) { // else if choice if user did not meet if choice
			decrypt(null, choice);//will start decrypt if chose choice 2

		}//end else if choice
	}
	public static void encrypt(String plainText, int shiftValue) { //public static void which has a variable called encrypt, it has a string called plainText and it is defining the variable shiftValue
		char ch; //holds a single character
		System.out.println("Enter a plainText: "); //Asks user to put a plainText
		plainText = scanLine.nextLine();//Scans user's input
		
		System.out.println("Enter Shift Value: ");// asks user how many they want it to be shifted
		shiftValue = scanNum.nextInt();// scans user's number input
		
		String encryptMessage = "";//String variable which is encryptMessage
		for(int i = 0; i < plainText.length(); i++){// A for loop for which i is being defined and is equal to 0, it is also saying that i will be less than the user's plainText length
			ch = plainText.charAt(i);// shifts letters to user's shiftValue
			
			if(ch >= 'a' && ch <= 'z'){//if statement is saying that ch is greater than or equal to a and less than or equal to z
	            ch = (char)(ch + shiftValue);//ch is added to the shiftsValue
	            
	            if(ch > 'z'){// if statement is saying that ch will be greater than z
	                ch = (char)(ch - 'z' + 'a' - 1);// ch is being subtracted to z, added to a, and then subtracted by 1
	            }
	            
	            encryptMessage += ch; //encryptMessage will add and equal to ch
	        }
	        else if(ch >= 'A' && ch <= 'Z'){// else if is here if the if statement was not met. It is saying that ch will be greater than or equal to capital A and is less than or equal to captial Z
	            ch = (char)(ch + shiftValue);//ch is added to the shiftValue
	            
	            if(ch > 'Z'){//if statement is saying that ch is greater than Z
	                ch = (char)(ch - 'Z' + 'A' - 1);//ch is being subtracted by capital Z, added to capital A, and then subtracted by 1
	            }
	            
	            encryptMessage += ch;// encryptMessage is added and equal to ch
	        }
	        else {//else statement is here if the if statement and else if statement was not met
	        	encryptMessage += ch;//encryptMessage is added and equal to ch
	        }
		}
		
		System.out.println("Encrypted Message = " + encryptMessage);//Encrypt Message is printed 
	}
		
	public static void decrypt(String plainText, int shiftValue) {//public static void which has a variable called decrypt, it has a string called plainText and is calling a variable called shiftValue
		char ch;//holds a single character
		System.out.println("Enter a plainText");//Asks user to enter a plainText
		plainText = scanLine.nextLine();// scans user's input
		
		String decryptMessage = "";//String variable which is decryptMessage
		
		System.out.println("Enter Shift Value: ");//Asks user to enter a shiftValue
		shiftValue = scanNum.nextInt();//Scans user's number input
		
		for(int i = 0; i < plainText.length(); i++){// A loop for which i is being called and is equal to 0, it is also saying that i is less than the plainText of the user's input
			ch = plainText.charAt(i);//Character is equal to the user's input
			
			if(ch >= 'a' && ch <= 'z'){ // if statement that says that ch is greater than or equal to a and is less than or equal to z
	            ch = (char)(ch - shiftValue);// ch is being subtracted by the shiftValue
	            
	            if(ch < 'a'){// if statement is saying that ch is greater than a
	                ch = (char)(ch + 'z' - 'a' + 1);// ch is being added to z, subtracted by a, and added to 1
	            }
	            
	           decryptMessage += ch;//decryptMessage is being added and is equal to ch
	        }
	        else if(ch >= 'A' && ch <= 'Z'){//else if statement is saying that ch is greater than or equal to capital A and is less than or equal to capital Z
	            ch = (char)(ch - shiftValue);//ch is being subtracted by the shiftValue
	            
	            if(ch < 'A'){//if statement is saying that ch is less than capital A
	                ch = (char)(ch + 'Z' - 'A' + 1);// ch is being added to capital Z, subtracted to capital A, and is added to 1
	            }
	            
	           decryptMessage += ch;//decryptMessage is being added and is equal to ch
	        }
	        else {// else statement is here if the if statement was not met
	        	decryptMessage += ch;//decryptMessage is being added and is equal to ch
	        }
		}
		
		System.out.println("Decrypted Message = " + decryptMessage);//Prints out the decryptMessage
	}
		
	public static void main(String[] args) {//helps run everything in the code
		userChoice();//variable called userChoice makes it run
	}
}


	
	

	



