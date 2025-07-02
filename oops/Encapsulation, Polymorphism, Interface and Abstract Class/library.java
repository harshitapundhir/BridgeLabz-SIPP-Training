import java.util.*;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration(); // days
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 21;
    }

    public void reserveItem(String borrowerName) {
        if (available) {
            borrower = borrowerName;
            available = false;
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        if (available) {
            borrower = borrowerName;
            available = false;
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public void reserveItem(String borrowerName) {
        if (available) {
            borrower = borrowerName;
            available = false;
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

public class library {
    public static void manageLibrary(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("StudentA");
                System.out.println("Available after reservation: " + r.checkAvailability());
            }

            System.out.println("-----");
        }
    }

    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book("B001", "Java Programming", "James Gosling"));
        libraryItems.add(new Magazine("M001", "Tech Today", "TechWorld"));
        libraryItems.add(new DVD("D001", "Inception", "Christopher Nolan"));

        manageLibrary(libraryItems);
    }
}
