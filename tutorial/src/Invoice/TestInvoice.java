package Invoice;

public class TestInvoice {


	public static void main(String[] args) {
		//invoice run 1

		Customer c = new Customer("island", "Dr evil", 1230.0);//this creates a new customer with these information
		Invoice in = new Invoice(c);//creates new Invoice for the customer
		in.addToOrder(new Product("flame Thrower",123.80), 3);//adds product in their order
		in.addToOrder(new Product("sharks", 105.2),2);
		in.addToOrder(new Product("lasers",50.5),20);
		
		
		runInvoice(c,in); //runs invoice

		//invoice run 2
		Customer c1 = new Customer("Wayne Tower", "Batman", 1000000000.00);
		Invoice in1 = new Invoice(c1);
		in1.addToOrder(new Product("Grappler",500.00), 1);
		in1.addToOrder(new Product("Throwing Bat knifes",2341.2), 5);
		in1.addToOrder(new Product("BatMobile",3000.99), 1);
		in1.addToOrder(new Product("Kryptonite Ring",500000.000), 1);
		in1.addToOrder(new Product("Finger Taser",1900000.13), 1);
		runInvoice(c1, in1);

		//invoice run 3
		Customer c2 = new Customer("Star Lab", "Green Arrow", 3000000000.23);
		Invoice in2 = new Invoice(c2);
		in2.addToOrder(new Product("Blunt Arrows",10000.00), 10);
		in2.addToOrder(new Product("Blast Arrows",10000.00), 10);
		in2.addToOrder(new Product("Electrical Arrows",10000.00), 10);
		in2.addToOrder(new Product("Bow", 120000.00), 1);
		in2.addToOrder(new Product("Costume",300000.00), 1);
		
		
		runInvoice(c2, in1);
		
		//invoice run 4
		
		Customer c3 = new Customer("Stark Tower", "Tony Stark", 1000000000.0);
		Invoice in3 = new Invoice(c3);
		in3.addToOrder(new Product("Suit",500000000.00), 1);
		in3.addToOrder(new Product("Thrusters", 1000000000.88), 1);
		in3.addToOrder(new Product("Vibranium",1000000000.99), 1);
		in3.addToOrder(new Product("Paints", 10000.000),5);
		in3.addToOrder(new Product("Arc Reactor", 10000000000000000.0), 1);
		
		runInvoice(c3, in3);
		
	}
	/**
	 * this runs the inVoice method
	 * @param c - Customer
	 * @param i - Invoice for the customer
	 */
	public static void runInvoice(Customer c, Invoice i) {//Prints customer's invoice
		i.printInvoice();//this runs the printInvoice in Invoice method

		if(c.getEvilFunds()- i.amountDue() < 0) {//if statement sees if customer has not enough funds for their order
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getEvilFunds());//adds funds to the customer's evilFunds so that their order can be approved
			System.out.println("New funds total: " + c.getEvilFunds());//prints the new funds for customer
			i.printInvoice();//runs printInvoice again so that the customer now has their order approved

		}//end if
		
		
	}//end runInvoice

}//end TestInvoice




