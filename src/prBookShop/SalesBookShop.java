package prBookShop;

public class SalesBookShop extends BookShop {

	private double discountPercentage;
	private String[] saleAuthors;

	public SalesBookShop(double discountPercentage, String[] saleAuthors) {
		super();
		this.discountPercentage = discountPercentage;
		this.saleAuthors = saleAuthors;
	}

	public SalesBookShop(int arraySize, double discountPercentage, String[] saleAuthors) {
		super(arraySize);
		this.discountPercentage = discountPercentage;
		this.saleAuthors = saleAuthors;
	}

	public void setSales(double discountPersentage, String[] saleAuthors) {
		this.discountPercentage = discountPersentage;
		this.saleAuthors = saleAuthors;

	}

	public String[] getSales() { // tutaj nie wiem czy dobrze zrobione
		return saleAuthors;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	private int seekSalesAuthor(String author) {
		int i = 0;
		for (String s : saleAuthors) {
			if (s.equalsIgnoreCase(author)) {
				return i;
			} else
				++i;
		}
		return -1;
	}

	public void addBook(String author, String title, double basePrice) {
		Book newBook;
		if (seekSalesAuthor(author) != -1) {
			newBook = new SalesBook(author, title, basePrice, this.discountPercentage);
		} else {
			newBook = new Book(author, title, basePrice);
		}
		addBook(newBook);

	}
	
	public String toString() {
		String str1 = discountPercentage + "% [";
		String str2 = "";
		for(String s : saleAuthors){
			
			str1 += " " +s;
		}
		str1 += "\n";
		
		str2 = super.toString();
		
		return str1 + "[" + str2 + "]";
	}

}
