package bookstore;

public class EBook extends Book {
	private String filetype;

	public EBook(String title, String author, String isbn, double price, int yearPublished, String filetype) {
		super(title, author, isbn, price, yearPublished);
		this.filetype = filetype;
	}

	public String getfiletype() {
		return filetype;
	}

	public void setfiletype(String filetype) {
		this.filetype = filetype;
	}

	@Override
	public String toString() {
		return "EBook [title=" + getTitle() + ", author=" + getAuthor() + ", isbn=" + getIsbn() + ", price="
				+ getPrice() + ", yearPublished=" + getYearPublished() + ", filetype=" + filetype + "]";
	}

	@Override
	public boolean isAvailable() {
		return true; 
	}

	@Override
	public void buyBook(int quantity, String email, String address) {
		if(quantity>1)
			{
			throw new IllegalArgumentException("EBooks can only be purchased in a quantity of 1");
		}
		else
		{
			System.out.println("EBook purchased successfully! Quantity: " + quantity + ", Email: " + email + ", Address: " + address);
			System.out.println("Total price: " + (getPrice()));
			System.out.println("EBook file type: " + filetype);
			System.out.println("You can download your EBook from your account.");
			mailservice.sendEmail(email);
		}
		
	}

}
