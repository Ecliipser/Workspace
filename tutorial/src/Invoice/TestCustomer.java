package Invoice;

public class TestCustomer {

	public static void main(String[] args) {

		Customer theCustomer = new Customer();
		Customer theCustomer1= new Customer("Danny","Genesis",1922);
		System.out.println(theCustomer.toString());
		System.out.println(theCustomer1.toString());
		
		System.out.println();
		
		Product theProduct = new Product();
		Product theProduct1 = new Product("Gun ", 75);
		Product theProduct2 = new Product("Spear ",15);
		
		
		System.out.println(theProduct1.toString());
		System.out.println(theProduct2.toString());
		
		System.out.println();
		
		LineItem Item = new LineItem();
		LineItem Item2 = new LineItem(new Product("Vegetables ", 5), 3);
		LineItem Item3 = new LineItem(new Product("Fruits ", 10), 6);
		
		System.out.println(Item2.toString());
		System.out.println(Item3.toString());
	}

}
