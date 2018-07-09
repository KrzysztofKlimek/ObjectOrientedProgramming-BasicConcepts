package prBookShop;

public class FlexibleSalesBookShop extends BookShop {

	private FlexibleSales sale;

	public FlexibleSalesBookShop(FlexibleSales o) {
		super();
		this.sale = o;
	}

	public FlexibleSalesBookShop(int cap, FlexibleSales o) {
		super(cap);
		this.sale = o;
	}

	public void setOferta(FlexibleSales o) {
		this.sale = o;
	}

	public FlexibleSales getFlexibleSale() {
		return this.sale;
	}

	public void addBook(String a, String t, double p) {
		Book newBook = new Book(a, t, p);
		double discountPercentage = sale.getDiscountPercentage(newBook);
		if (discountPercentage > 0) {
			newBook = new SalesBook(a, t, p, discountPercentage);
			addBook(newBook);
		} else
			addBook(newBook);

	}

	public String toString() {
		String str = sale.toString();
		str += super.toString();
		return str;
	}
}
