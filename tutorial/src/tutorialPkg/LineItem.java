package tutorialPkg;

public class LineItem {

	private int qty;
	private Product theProduct;
	
	public LineItem() {
		qty = 0;
	}
	public LineItem(Product theProduct, int qty) {
		this.qty = qty;
		this.theProduct = theProduct;
	}
	
	public int getQty() {
		return qty;
	}
	
	public Product getTheProduct() {
		return theProduct;
	}
	public String toString() {
		return "Product " + theProduct + " Quantity: " + qty;
	}
}
