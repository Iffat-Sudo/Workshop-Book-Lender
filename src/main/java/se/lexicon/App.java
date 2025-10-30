package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");

        // Step 2: Create a Person object
        Person marcus = new Person("Marcus", "Andersson");

        // Step 3: Marcus borrows the first book
        marcus.loanBook(book1);

        // Step 4: Show Marcus’s information
        System.out.println(marcus.getPersonInformation());

        // Step 5: Marcus returns the book
        marcus.returnBook(book1);

        // Step 6: Show Marcus’s information again
        System.out.println(marcus.getPersonInformation());



    }

}
