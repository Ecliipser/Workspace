package tutorialPkg;

public class TestProduct {

	public static void main(String[] args) {
		
		Product theProduct = new Product();
		Product theProduct1 = new Product("Gun ", 75);
		Product theProduct2 = new Product("Spear ",15);
		
		
		System.out.println(theProduct1.toString());
		System.out.println(theProduct2.toString());
	}

}
