package tutorialPkg;

import java.util.Scanner;

public class DataStructureAssignment4 {

	public static void main(String[] args) {//helps run everything in the code
		
		
		String[] names = {"Danny","Francis","Marc","Miguel","Josh","Angel","Christian","Jayvis","Stefano","Paul"};//Names
		
		double[] raisedMoney = {100,210,230,110,120.60,430,142.50,159,69,700.25};//how much each person raised money
		
		boolean[] returnedForm = {true,false,false,true,true,true,false,false,true,true};//tells who returned their form
		
		//step 1
		for(int i = 0; i < names.length; i++) {//prints out names, how much each raised, and who returned their form
			System.out.println("Names: " + names[i] + " $" + raisedMoney[i] + " form: " + returnedForm[i]);//prints out name, how much they raised, and if they returned their form
		}
		
		//step 2
		
		double totalAmt = 0;//store total amount raised
		for(int i = 0; i < raisedMoney.length; i++) {//checks raisedMoney
			totalAmt += raisedMoney[i];//adds each index to totalAmt
		}
		double avgRaised = totalAmt / names.length; //calculates avg amount raised
		
		int bigMoneyCount = 0;//tracks how many people raised over $200
		
		System.out.println();//spaces
		for(int i = 0; i < raisedMoney.length; i++) {
			//searching for > 200
			//counting number of people over $200
			if(raisedMoney[i] > 200) {//if statement is saying that if raisedMoney is greater than 200
				System.out.println(names[i] + " Raised: $" + raisedMoney[i]);//prints out the names and how much they raised
				bigMoneyCount++;//add one to bigMoneyCount
				
			}
		}
		System.out.println();//spaces
		for (int i = 0; i < returnedForm.length; i++) {
			//searching for people who have not returned their form
			if(returnedForm[i] == false) {//people who didn't return their form
				System.out.println(names[i] + " has not returned their form");//prints out the peoples names that didn't return their form
			
			}
		}
		System.out.println();//spaces 
		System.out.println("Total amount Raised: $" + totalAmt);//prints out total amount raised
		System.out.println("avg amount Raised: $" + avgRaised);//prints out average amount raised
		
		double lowestAmt;//declare variable for item tracked
		lowestAmt = raisedMoney[0];//assume first index is item searched for
		int nameIndex = 0;//tracks index of the person with lowest amount raised
		for(int i = 0; i < raisedMoney.length; i++) {//find lowest amount raised
			if(raisedMoney[i] < lowestAmt) {//tells us that if raisedMoney is less than lowest amount
				lowestAmt = raisedMoney[i];//set new lowest value
				nameIndex = i;//see the person with lowest amount raised
			}
		}
		
		System.out.println("Lowest amount raised: $" + lowestAmt + " by " + names[nameIndex]);//prints out lowest amount raised and to see who raised the lowest
		
	}//end main
	

}
