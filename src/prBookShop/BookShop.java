
package prBookShop;

import java.util.Arrays;

public class BookShop {
	private static final int INITIAL_CAPACITY = 16;
	private int numBooks;
	private Book[] books;
	
	public BookShop() {
		this(INITIAL_CAPACITY);
	}
	
	public BookShop(int cap) {
		numBooks = 0;
		books = new Book[cap];
	}
	
	public void addBook(String a, String t, double p) {
		addBook(new Book(a, t, p));
	}
	
	public void deleteBook(String a, String t) {
		int i = seekBook(a, t);
		if (i >= 0) {
			deleteBook(i);
		}
	}
	
	public double getBasePrice(String a, String t) {
		double p = 0;
		int i = seekBook(a, t);
		if (i >= 0) {
			p = books[i].getBasePrice();
		}
		return p;
	}
	
	public double amountDue(String a, String t) {
		double p = 0;
		int i = seekBook(a, t);
		if (i >= 0) {
			p = books[i].amountDue();
		}
		return p;
	}
	
	@Override
	public String toString() {
		String str = "";
		if (numBooks > 0) {
			str += books[0].toString();
			for (int i = 1; i < numBooks; ++i) {
				str += ",\n " + books[i].toString();
			}
		}
		return "["+str+"]";
	}
	
	protected void addBook(Book b) {
		int i = seekBook(b.getAuthor(), b.getTitle());
		if (i >= 0) {
			books[i] = b;
		} else {
			if (numBooks == books.length) {
				books = Arrays.copyOf(books, 2 * books.length);
			}
			books[numBooks] = b;
			++numBooks;
		}
	}
	
	protected void deleteBook(int i) {
		if (0 <= i && i < numBooks) {
			--numBooks;
			books[i] = books[numBooks];
			books[numBooks] = null;
		}
	}

	protected int seekBook(String a, String t) {
		int i = 0;
		while ((i < numBooks)
			   && ! (books[i].getAuthor().equalsIgnoreCase(a)
					 && books[i].getTitle().equalsIgnoreCase(t))) {
			++i;
		}
		if (i == numBooks) {
			i = -1;
		}
		return i;
	}
}