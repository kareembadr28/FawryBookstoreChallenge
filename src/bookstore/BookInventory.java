package bookstore;

import java.nio.ReadOnlyBufferException;
import java.util.HashMap;
import java.util.List;

public class BookInventory {

	private HashMap<String, Book> inventory;
	public BookInventory() {
		inventory = new HashMap<>();
	}
	
	public void addBook(Book book) {
		if (book == null || book.getIsbn() == null || book.getIsbn().isEmpty()) {
			throw new IllegalArgumentException("Book or ISBN cannot be null or empty");
		}
		inventory.put(book.getIsbn(), book);
		System.out.println("Book added successfully: " + book);
	}
	
	public List<Book>RempveOutDatedBooks(int currentYear) {
		List<Book> outdatedBooks = inventory.values().stream()
				.filter(book -> book.getYearPublished() < currentYear - 10)
				.toList();
		for (Book book : outdatedBooks) {
			
			inventory.remove(book.getIsbn());
		}
		return outdatedBooks;
	}
	public void BuyBook(String isbn, int quantity, String email, String address) {
		if (isbn == null || isbn.isEmpty()) {
			throw new IllegalArgumentException("ISBN cannot be null or empty");
		}
		if (!inventory.containsKey(isbn)) {
			throw new IllegalArgumentException("Book with ISBN " + isbn + " not found in inventory");
		}
		Book book = inventory.get(isbn);
		if (!book.isAvailable()) {
			throw new IllegalArgumentException("Book is not available for purchase");
		}
		book.buyBook(quantity, email, address);
	}
}
