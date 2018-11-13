package tutorialPkg;
import java.util.Scanner; 
public class ReverseName {

	public static void main(String[] args) { //Helps run everything in the code

	      String originalName, reverse = ""; // This takes in your original name, this is the name that is being reversed
	      Scanner in = new Scanner(System.in); // Scans the name
	     
	      System.out.println("Enter a name to reverse: "); //Asks user to enter their name so it can be reversed
	      originalName = in.nextLine(); // Takes in original name and takes it next line
	     
	      int length = originalName.length();// length is being defined has a a value in it which is taking the length of the original name
	     
	      for (int i = length - 1 ; i >= 0 ; i--) // i is being defined and the original length of the name is being subtracted by 1 until your i is greater than or equal to 0 
	         reverse = reverse + originalName.charAt(i); //reverse is the string which has a value in it which reverse is being added to the original character 
	         
	      System.out.println("Reverse of the name:\n" + reverse); //Tells user their name in reversed and it is added to the string reverse afterwards
		

}
}