
import prBookShop.*;

public class SalesBookShopTest {
	private static void addBooks(BookShop bs) {
		bs.addBook("george orwell", "1984", 8.20);
		bs.addBook("Philip K. Dick", "Â¿SueÃ±an los androides con ovejas elÃ©ctricas?", 3.50);
		bs.addBook("Isaac Asimov", "FundaciÃ³n e Imperio", 9.40);
		bs.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
		bs.addBook("Alex Huxley", "Un Mundo Feliz", 6.50);
		bs.addBook("Isaac Asimov", "La FundaciÃ³n", 7.30);
		bs.addBook("William Gibson", "Neuromante", 8.30);
		bs.addBook("Isaac Asimov", "Segunda FundaciÃ³n", 8.10);
		bs.addBook("Isaac Newton", "arithmetica universalis", 7.50);
		bs.addBook("George Orwell", "1984", 6.20);
		bs.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);
	}
	private static void deleteBooks(BookShop bs) {
		bs.deleteBook("George Orwell", "1984");
		bs.deleteBook("Alex Huxley", "Un Mundo Feliz");
		bs.deleteBook("Isaac Newton", "Arithmetica Universalis");
	}
	private static void printPrices(BookShop bs) {
		System.out.println("amountDue(George Orwell, 1984) "+bs.amountDue("George Orwell", "1984"));
		System.out.println("amountDue(Philip K. Dick, ¿Sueñan los androides con ovejas eléctricas?) "+bs.amountDue("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
		System.out.println("amountDue(isaac asimov, Fundación e imperio) "+bs.amountDue("isaac asimov", "Fundación e imperio"));
		System.out.println("amountDue(Ray Bradbury, Fahrenheit 451) "+bs.amountDue("Ray Bradbury", "Fahrenheit 451"));
		System.out.println("amountDue(Alex Huxley, Un Mundo Feliz) "+bs.amountDue("Alex Huxley", "Un Mundo Feliz"));
		System.out.println("amountDue(Isaac Asimov, La Fundación) "+bs.amountDue("Isaac Asimov", "La Fundación"));
		System.out.println("amountDue(william gibson, neuromante) "+bs.amountDue("william gibson", "neuromante"));
		System.out.println("amountDue(Isaac Asimov, Segunda Fundación) "+bs.amountDue("Isaac Asimov", "Segunda Fundación"));
		System.out.println("amountDue(Isaac Newton, Arithmetica Universalis) "+bs.amountDue("Isaac Newton", "Arithmetica Universalis"));
	}
	public static void main(String[] args) {
		String[] saleAuthors = { "George Orwell", "Isaac Asimov" };
		BookShop bs;
		try {
			bs = new SalesBookShop(Integer.parseInt(args[0]), 20, saleAuthors);
		} catch (Exception e) {
			bs = new SalesBookShop(20, saleAuthors);
		}
		addBooks(bs);
		System.out.println();
		System.out.println(bs);
		System.out.println();
		deleteBooks(bs);
		System.out.println();
		System.out.println(bs);
		System.out.println();
		printPrices(bs);
	}
}
