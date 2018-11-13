package tutorialPkg;

public class SuperHeroArrays {

	public static void main(String[] args) {//helps run everything in the code
		String[] superHeroArray = {" Superman "," Flash "," Iron Man "," Antman "," Batman ",};//String array which has Superman, Flash, Iron Man, Antman, and Batman
		boolean[] isHumanArray = {false, true, true,true, true, };//A boolean which is if the heroes are humans or not
		String[] superPowerArray = {"Strength. ", "Speed. ", "Suit. ", "Shrinks. ", "Gadgets. "};//String superPowerArray which has the superheroes' power which is Speed, Suit, Shrink, and Gadgets
		
		System.out.println(superHeroArray[0]); //prints out first element in array
		System.out.println(superHeroArray[superHeroArray.length - 1]);//prints out the last element in array
		
		for(int i = 0; i < superHeroArray.length; i++) { //a for loop which initializes i and has a value of 0, and it is saying that i is less than the length of the superhero names
			System.out.println("i: " + i + " Name: " + superHeroArray[i] + "\tPower: " + superPowerArray[i] + "Are they human?: " + isHumanArray[i] );//prints super heroes name, power, and if they are human
		}//end for superHeroArray
		
			System.out.println();//used for spacing
		for(int i = 0; i < isHumanArray.length; i++) {  //a for loop which sees if they are human or not
			System.out.println("Name:" + superHeroArray[i] + "Have been exposed to ‘Couprinite': " +  "Are they human?: "  + isHumanArray[i] );// prints out that all heroes has been exposed to Couprinite
			if(isHumanArray[i] == true) {// if statement is saying that if the heroes are human than it will equal true
				System.out.println("They still have their power since they are still human. " + "\tPower: " + superPowerArray[i]);//prints out that they still have their power since they are human
				System.out.println();//used for spacing
			}else {//else statement is here if the heroes are not human
				System.out.println("They have lost their power since they are non-human which turns their power to none. Power: NONE " );// prints out that they are non-human which means their power becomes none	
				System.out.println();//used for spacing 
				
			}//end else
		}//end for isHumanArray
		
		
	}//end main

}
