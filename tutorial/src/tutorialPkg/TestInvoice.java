package tutorialPkg;

public class TestInvoice {

	public static void main(String[] args) {
		//invoice run 1

		Customer c = new Customer("island", "Dr evil", 1230.0);
		Invoice in = new Invoice(c);
		in.addToOrder(new Product("flame Thower",123.80), 3);
		in.addToOrder(new Product("sharks", 105.2),2);
		in.addToOrder(new Product("lasers",50.5),20);
		
		runInvoice(c,in); //runs invoice

		//invoice run 2
		
		//invoice run 3
		
		//invoice run 4

	}

}
