package bookstore;

public class PaperBook extends Book {
private int stock;
	public PaperBook(String title, String author, String isbn, double price, int yearPublished, int stock) {
		super(title, author, isbn, price, yearPublished);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "PaperBook [title=" + getTitle() + ", author=" + getAuthor() + ", isbn=" + getIsbn() + ", price="
				+ getPrice() + ", yearPublished=" + getYearPublished() + ", stock=" + stock + "]";
	}

	@Override
	public boolean isAvailable() {
		return stock > 0;
	}

	@Override
	public void buyBook(int quantity, String email, String address) {
if(quantity >stock)
{
throw new IllegalArgumentException("Not enough stock available");
}
else
{
		stock -= quantity;
		System.out.println("Book purchased successfully! Quantity: " + quantity + ", Email: " + email + ", Address: " + address);
		System.out.println("Remaining stock: " + stock);
		System.out.println("total price: " + (getPrice() * quantity));
		shipingservice.ship(address);
		
}
	}

}
