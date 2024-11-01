package se.lexicon;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Book bookOne = new Book("Mr Beans","Jonsoon Grey");
        Book bookTwo = new Book("Tintin in RDC","Klas Nilsson");
        Book bookThree = new Book("Tarzan ","Marcus Lindstom");


        Person personOne = new Person("John Doe","John Doe");
        Person personTwo = new Person("Jannette","Jackson");
        Person personThree = new Person("Micheal","JackDaniel");


        personOne.loanBook(bookOne);
        personThree.loanBook(bookTwo);
        personTwo.loanBook(bookOne);

        System.out.println("============================");

        System.out.println(personOne.getPersoninfo());
        System.out.println(personTwo.getPersoninfo());
        System.out.println(personThree.getPersoninfo());

        System.out.println("********************************");

        System.out.println(personOne.getId());

        System.out.println(bookOne.getAuthor());
        System.out.println(bookOne.getTitle());

        System.out.println("++++++++++++++++++++++++++");

        System.out.println(bookTwo.getId());

        //System.out.println(bookTwo.toString());









    }
}