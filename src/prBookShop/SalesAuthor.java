package prBookShop;

public class SalesAuthor implements FlexibleSales {

	private double discountPercentage;
	private String[] salesAuthor;
	
	public SalesAuthor(double desc, String[] a){
		this.discountPercentage = desc;
		this.salesAuthor = a;
	}
	
	public double getDiscountPercentage(Book b) {
		if (seekSalesAuthor(b.getAuthor()) != -1) {
			return discountPercentage;
		} else
			return 0;
	}

	public String toString() {
		String str = discountPercentage + "[";
		for (String s : salesAuthor) {
			str += s;
		}

		str += "]";

		return str;

	}
	
	public int seekSalesAuthor(String a) {
		int i = 0;
		for (String s : salesAuthor) {
			if (s.equalsIgnoreCase(a)) {
				return i;
			} else
				i++;
		}
		return -1;
	}
	
	
}
