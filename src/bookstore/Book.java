package bookstore;


public abstract class Book {
	private String title;
	
	private String author;
	
	private String isbn;
	
	private double price;
	
	private int yearPublished;
	
	public Book(String title, String author, String isbn, double price, int yearPublished) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.yearPublished = yearPublished;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
		public double getPrice() {
		return price;
	}
		
		public double getYearPublished() {
		return yearPublished;
	}
		
		public void setTitle(String title) {
		this.title = title;
	}
		
		public void setAuthor(String author) {
		this.author = author;
	}
		
			public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
			
		public void setPrice(double price) {
		this.price = price;
	}
		
		public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
		
		public String toString() {
			return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + 
					", Price: $" + price + ", Year Published: " + yearPublished;
		}
		
		
	public abstract boolean isAvailable();
	public abstract void buyBook(int quantity,String email, String address);

}
