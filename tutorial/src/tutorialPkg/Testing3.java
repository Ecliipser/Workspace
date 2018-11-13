package tutorialPkg;

public class Testing3 {

	
	public static void main(String[] args) {
		
		 int sumOfSquares = 0; 
		 
		int [] ref = {2,2,2,2};
		for(int i = 0; i < ref.length; i++) { 
		 sumOfSquares += Math.pow(ref[i], 2); 
		 } 
		System.out.println(ref.length + sumOfSquares);
	}
}
