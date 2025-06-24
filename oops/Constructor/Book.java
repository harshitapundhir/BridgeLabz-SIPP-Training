package oops.Constructor;

public class Book {
    String title;
    String author;
    double price;
    boolean available;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 299.99);
        book1.borrowBook();
        book1.borrowBook();
    }
}
