package tutorialPkg;

public class Tutorial17 {
	
	public static boolean isSIngleDigit(int number) {
		if (number >= 1 && number <= 9) {
			return true;
		}
		else {
			return false;
		}
	}
		
		
			
				
			
		
	
	public static void main(String[] args) {
		System.out.println(isSIngleDigit(4));
		System.out.println(isSIngleDigit(76));
		System.out.println(isSIngleDigit(42));

	}

}
