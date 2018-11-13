package tutorialPkg;
import java.util.Scanner;
public class HalloweenGamePractice3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] monster = {"Vampire","Mummy","Frankenstein","Zombie","Skeleton","Werewolf","Player"};
		
		System.out.println("Enter player name: ");//prompt
		monster[monster.length -1] = "Player: " + input.nextLine();
		
		int[] coins = new int[monster.length];
		
		//add random number of coins
		for(int i = 0; i < monster.length; i++) {
			coins[i] = (int)(Math.random() * 8) + 2;
			System.out.println(monster[i] + " has " + coins[i] + " gold coins. ");
		}
		String[] abilities = new String[monster.length];
		
		abilities[0] = "fangs";
		abilities[1] = "fear";
		abilities[2] = "sheer brute strength";
		abilities[3] = "brain eating teeth";
		abilities[4] = "spook";
		abilities[5] = "claws";
		abilities[6] = "ninja";
	
		System.out.println();
		//prints out abilities
		for(int i = 0; i < monster.length; i++) {
			System.out.println(monster[i] + " will attack with " + abilities[i]);
	}
		System.out.println();
	int[] hp = new int[monster.length];
	//assign random hp
	for(int i = 0; i < monster.length; i++) {
		hp[i] = (int)(Math.random() * 15 + 2);
	}
	System.out.println();
		//prints out hp
	for (int i = 0; i < monster.length; i++) {
		System.out.println(monster[i] + " has " + hp[i] + " health points");
	}
	System.out.println("The " + monster[2] + " ate a teenager, how " +
	"many coins did it get?");//prompt to enter a number
	//taking in a number from user input
	coins[2] += input.nextInt();//adding coins to coins[2]
	input.nextLine();//get rid of extra enter character
	
	//taking in a string from user input
	System.out.println(monster[2] + " morphs into what? ");//prompt
	monster[2] = input.nextLine();
		
	System.out.println("The monster is a: " + monster[2]);

		
		
	//todo list
	int totalCoins = coins[monster.length-1];//accumulator
	int turns = 0;//track turns
	//fight while player hp > 0
	while(hp[hp.length-1] > 0) {
	  int randomMonster = (int)(Math.random() * monster.length);
	  if(randomMonster != monster.length-1) {
	  //decide hit or be hit
	  int hitChance = (int)(Math.random() * 2);
	  
	  if(hitChance % 2 == 0) {//
		//subtract random hp if player is hit
		int randomDmg = (int)(Math.random() * 2 + 1);
		hp[monster.length-1] -= randomDmg;//subtracting hp
		System.out.println(monster[randomMonster] + " hit you for " 
				+ randomDmg + "hp! " + hp[monster.length-1] 
				+ " Hp Left. ");
	  }
	  else {//player does dmg
		  System.out.println("Player hits with " + abilities[monster.length-1]
			+ " " + monster[randomMonster] + " runs away. It left "
			+ coins[randomMonster] + " coins");
		 //collect coins
		  totalCoins += coins[randomMonster];
	  }
	  //track number of turns
	  turns++;   
	  }//end if
	  System.out.println();
	}//end while 
	
	System.out.println("You run away with " + totalCoins + " coins"
			+ " and lasted " + turns + " Turns. ");
		
		
		
	}//end main
}









