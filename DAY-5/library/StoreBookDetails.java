package storeBookDetails;

import library.Book;

public class StoreBookDetails extends Book {
    private String title;
    private String author;
    private String editor;

    public StoreBookDetails(String bookType, int accountNumber, String title, String author, String editor) {
        super(bookType, accountNumber);
        this.title = title;
        this.author = author;
        this.editor = editor;
    }

    public void display() {
        System.out.println("Book Type: " + bookType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Editor: " + editor);
    }
}