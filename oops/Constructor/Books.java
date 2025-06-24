package oops.Constructor;


class Books{
    public String ISBN;
    protected String title;
    private String author;

    public Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Books {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void showInfo() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title);
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("123-456", "Java Fundamentals", "James Gosling");
        ebook.showInfo();
        System.out.println("Author: " + ebook.getAuthor());
    }
}
