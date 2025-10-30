package se.lexicon;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private Book[] borrowed = new Book[0];

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        id = Person.getNextId();
    }

    private static int getNextId() {
        return sequencer++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book[] getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Book[] borrowed) {
        this.borrowed = borrowed;
    }
    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setBorrower(this);
            Book[]newArray[newArray.length-1] = book;

    }
    }

    public String getPersonInformation() {
        return " ";
    }
}
