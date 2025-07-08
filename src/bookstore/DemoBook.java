package bookstore;

public class DemoBook extends Book {

	public DemoBook(String title, String author, String isbn, double price, int yearPublished) {
		super(title, author, isbn, price, yearPublished);
	}

	@Override
	public String toString() {
		return "DemoBook{" +
				"title='" + getTitle() + '\'' +
				", author='" + getAuthor() + '\'' +
				", isbn='" + getIsbn() + '\'' +
				", price=" + getPrice() +
				", yearPublished=" + getYearPublished() +
				'}';
	}

	@Override
	public boolean isAvailable() {
		return false;
	}

	@Override
	public void buyBook(int quantity, String email, String address) {
       throw new UnsupportedOperationException("DemoBook cannot be purchased.");		
	}

}
