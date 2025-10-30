package se.lexicon;

import se.lexicon.model.Person;

import java.util.UUID;

public class Book {
        private final String id;
        private String title;
        private String author;
        private boolean available;
        private Person borrower;

        public Book(String title, String author) {
            setTitle(title);
            setAuthor(author);
            setAvailable(true);
            id = UUID.randomUUID().toString();
        }

        public Book(String title, String author, Person borrower) {
            this(title, author);
            setBorrower(borrower);
        }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }
}



