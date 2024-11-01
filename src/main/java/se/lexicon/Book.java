package se.lexicon;

public class Book {


    private static int counter = 101;
    private int id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.id = ++counter;
        this.title = title;
        this.author = author;
        this.available = true;
        this.borrower = null;

    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        borrower.loanBook(this);

    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        this.available = (borrower == null);
    }

    public String getBookInfo() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + (available ? "YES" : "NO, Borrower: " + borrower);
    }






}
