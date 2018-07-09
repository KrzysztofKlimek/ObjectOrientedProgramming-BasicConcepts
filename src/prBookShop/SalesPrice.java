package prBookShop;

public class SalesPrice implements FlexibleSales {
	
	private double discountPercentage;
	private double priceThreshold;
	
	public SalesPrice(double desc, double prec){
		this.discountPercentage = desc;
		this.priceThreshold = prec;
		
	}
	
	public double getDiscountPercentage(Book b){
		if(b.getBasePrice() >= priceThreshold){
			return discountPercentage;
		}
		else
			return 0;
	}
	
	public String toString(){
		return discountPercentage + "(" + priceThreshold + ")";
	}

}
