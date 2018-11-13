package tutorialPkg;

public class Quiz1Updates {

	
	public static int smallest(int x, int y, int z) { //public static int which has a variable name called smallest and has an integer of x, y and z.
		
		  int smallNum = java.lang.Math.min(x,y); // variable name called smallNum and checks which is smaller, x or y
		  
		  int smallestNum = java.lang.Math.min(z, smallNum); // variable name called smallestNum and checks the smallest of z  and has the result of x and y
		  
		  return smallestNum;//returns the result
		
	}//end of public static int smallest
	
	public static void main(String[] args) {//helps run everything in the code
		
	       System.out.println(smallest(5,25,50)); //Checks which is the smallest which is 5
	       
	        System.out.println(smallest(185,137,90));//Checks which is the smallest which is 90
	        
	        System.out.println(smallest(321,456,789));//Checks which is the smallest which is 321
	      

	}//end of public static void main

}//end Quiz1Updates
