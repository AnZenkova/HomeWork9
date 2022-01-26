package com.company;

public class Main {

    public static void main(String[] args) {
        // 1-я книга
        String bookTitle = "Сияние";
        String nameAuthor = "Стивен";
        String surnameAuthor = "Кинг";
        int bookReleaseYear = 2016;
        Book theShining = new Book(bookTitle, new Author(nameAuthor, surnameAuthor), bookReleaseYear);
        System.out.println("theShining = " + theShining.getBookAuthor());
        System.out.println("theShining.getBookTitle() = " + theShining.getBookTitle());
        System.out.println("theShining.getBookReleaseYear() = " + theShining.getBookReleaseYear());
        theShining.setBookReleaseYear(2000);
        System.out.println("theShining = " + theShining.getBookReleaseYear());
        // 2-я книга
        bookTitle = "Мастер и Маргарита";
        nameAuthor = "Михаил";
        surnameAuthor = "Булгаков";
        bookReleaseYear = 2020;
        Book masterAndMargarita = new Book(bookTitle, new Author(nameAuthor, surnameAuthor), bookReleaseYear);
        // 3-я книга
        bookTitle = "Гарри Поттер и филосовский камень";
        nameAuthor = "Джоан";
        surnameAuthor = "Роулинг";
        bookReleaseYear = 2000;
        Book harryPotter = new Book(bookTitle, new Author(nameAuthor, surnameAuthor), bookReleaseYear);

    }
}
