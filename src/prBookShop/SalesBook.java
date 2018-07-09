package prBookShop;

public class SalesBook extends Book {
	
	private double discountPercentage;
	
	public SalesBook (String author, String title, double basePrice, double discountPersentage){
		super(author, title, basePrice);
		this.discountPercentage = discountPersentage;
	}
	
	public double getDiscountPercentage(){
		return discountPercentage;
	}
	
	@Override
	public double amountDue(){
		double tax = getIVA()/100;
		return (getBasePrice() + getBasePrice()*tax);
	}
	
	@Override
	public String toString(){
		return "(" + getAuthor() + ";" + getTitle() + ";" + getBasePrice() + ";" + discountPercentage + ";" + getBasePrice() + ";" + getSalesPrice() + ";" + getIVA() + "; " + amountDue() + ")"; 
	
	}
	
	private double getSalesPrice(){
		return getBasePrice() - getBasePrice()*discountPercentage/100;
	}
	
}
