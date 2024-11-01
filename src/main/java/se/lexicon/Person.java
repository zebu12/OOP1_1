package se.lexicon;

import java.util.Arrays;

public class Person {

    private static int sequenser = 211;
    private int id;
    private String firstName;
    private String lastName;
    private Book[] borrowedBooks;

    public Person(String firstName, String lastName) {
        this.id = ++sequenser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new Book[0];
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void loanBook(Book book) {
        if (book.getBorrower() == null){
            book.setBorrower(this);


            borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length + 1);
            borrowedBooks[borrowedBooks.length - 1] = book;
            System.out.println("Book Title: " + book.getTitle() + " " + firstName + " " + lastName);
        } else {
            System.out.println("The book is already borrowed");
        }
    }

    public void returnBook(Book book) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == book) {
                book.setBorrower(null);
                borrowedBooks[i] = null;

                Book[] newborrowedBooks = new Book[borrowedBooks.length - 1];
                int newIndex = 0;

                for (int j = 0; j < borrowedBooks.length; j++) {
                    if (borrowedBooks[j] != null) {
                        newborrowedBooks[newIndex++] = borrowedBooks[j];
                    }
                }

                borrowedBooks = newborrowedBooks;
                System.out.println(firstName + " " + lastName + " has return the book: " + book.getTitle());
                return;

            }
        }
        System.out.println("The book is not borrowed");
    }

    public void showBorrowedBooks() {
        System.out.println(firstName + " " + lastName + " has borrowed books: ");
        for (Book borrowedBook : borrowedBooks) {
            if (borrowedBook != null) {
                System.out.println(borrowedBook.getTitle());
            }

        }
    }

    public String getPersoninfo(){
        return firstName + " " + lastName + " "+ id;
    }


}
