# Bookstore

This project is part of the **Fawry Full Stack Internship Challenge (N² Dev Slope #10)**.

## 📚 Project Description

**Bookstore** is a simple simulation of an online bookstore system built with Java and object-oriented principles.  
It supports multiple types of books and operations such as:

- 📦 Adding new books to inventory (PaperBook, EBook, DemoBook)
- 🛒 Buying books with handling based on book type
- ❌ Removing outdated books (published more than 10 years ago)
- 💬 Output prefixed with `Quantum book store:` for clear logging

---

## 📦 Book Types

| Type       | Description                                    | Can Buy? | Notes                             |
|------------|------------------------------------------------|----------|------------------------------------|
| PaperBook  | Physical book, has stock and shipping support | ✅       | Ships to an address                |
| EBook      | Digital book, sent via email (PDF, etc)       | ✅       | Can only buy 1 per transaction     |
| DemoBook   | Display-only book (not for sale)              | ❌       | Will throw error if purchase tried |

---

## 🧪 Features Demonstrated in `Main.java`

- Adding books with title, author, ISBN, price, and publish year.
- Buying available books and handling errors (not enough stock, invalid types, etc).
- Removing outdated books using the current year.
- Integration with dummy `ShippingService` and `MailService`.

---
## 📸 Screenshots

Below are some screenshots demonstrating different features of the Quantum Bookstore app.

---

### 🟢 1. Adding Books to Inventory
![Adding Books](screenshots/Screenshot%20(1239).png)

---

### 🛒 2. Buying a PaperBook
![Buying Book](screenshots/Screenshot%20(1244).png)

---

### ❌ 3. Buying a DemoBook (Not Allowed)
![DemoBook Error](screenshots/Screenshot%20(1242).png)

---

### ❌ 4. Trying to Buy Too Many PaperBooks (Stock Error)
![Stock Error](screenshots/Screenshot%20(1245).png)

---

### 🔁 5. Removing Outdated Books
![Removing Outdated Books](screenshots/Screenshot%20(1243).png)


## ▶️ How to Run

Compile and run the `Main` class. Sample output will show:

- Successful and failed purchases
- Inventory actions
- Removed outdated books

```bash
javac -d . *.java
java bookstore.Main
