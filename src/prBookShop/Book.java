
package prBookShop;

public class Book {
	private static double percIVA = 10;
	private String author;
	private String title;
	private double basePrice;
	
	public Book(String a, String t, double p) {
		author = a;
		title = t;
		basePrice = p;
	}
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public double amountDue() {
		return getBasePrice() + getBasePrice() * getIVA() / 100;
	}
	@Override
	public String toString() {
		return "("+getAuthor()+"; "+getTitle()+"; "+getBasePrice()
			+"; "+getIVA()+"%; "+amountDue()+")";
	}
	public static double getIVA() {
		return percIVA;
	}
	public static void setIVA(double p) {
		percIVA = p;
	}
}
