package com.company;

public class Book {
    private String bookTitle;
    private String Author;
    private int bookReleaseYear;

    public Book(String bookTitle, String bookAuthor, int bookReleaseYear) {
        this.bookTitle = bookTitle;
        this.Author = bookAuthor;
        this.bookReleaseYear = bookReleaseYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getBookAuthor() {
        return this.Author;
    }

    public int getBookReleaseYear() {
        return this.bookReleaseYear;
    }

    public void setBookReleaseYear(int year) {
        this.bookReleaseYear = year;
    }
}
