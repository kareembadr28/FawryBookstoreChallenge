package bookstore;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		 BookInventory inventory = new BookInventory();
	        PaperBook paperBook = new PaperBook("Book 1", "Author 1", "111", 150.0, 2010, 5);
	        EBook eBook = new EBook("Book 2", "Author 2", "222", 100.0, 2020, "pdf");
	        DemoBook demoBook = new DemoBook("Book 3", "Author 3", "333", 0.0, 2000);

	        inventory.addBook(paperBook);
	        inventory.addBook(eBook);
	        inventory.addBook(demoBook);

	        inventory.BuyBook("111", 2, "user1@example.com", "123 Street, City");

	        inventory.BuyBook("222", 1, "user2@example.com", "");

	        try {
	        	//bur demobook which is not allowed
 	            inventory.BuyBook("333", 1, "user3@example.com", "");
	        } catch (UnsupportedOperationException e) {
	            System.out.println("Quantum book store: ERROR - " + e.getMessage());
	        }



	}

}
