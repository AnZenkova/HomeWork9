package com.company;

import java.util.Objects;

public class Book {
    private String bookTitle;
    private String Author;
    private int bookReleaseYear;

    public Book(String bookTitle, com.company.Author Author, int bookReleaseYear) {
        this.bookTitle = bookTitle;
        this.Author = Author.toString();
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

    @Override
    public String toString() {
        return "Название книги: " + getBookTitle() + "; Имя автора: " + getBookAuthor() + "; Год издания: " + getBookReleaseYear();
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book bookTitle2 = (Book) other;
        return bookTitle.equals(bookTitle2.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle);
    }
}
