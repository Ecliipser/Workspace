package tutorialPkg;

public class LineItem {

	private int qty;
	private Product theProduct;
	
	public LineItem() {
		qty = 0;
	}
	public LineItem(int qty, Product theProduct) {
		this.qty = qty;
		this.theProduct = theProduct;
	}
	public String toString() {
		return "Qty: " + qty + "theProduct: " + theProduct;
	}
}
