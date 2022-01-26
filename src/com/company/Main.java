package com.company;

import java.util.Arrays;

public class Main {

    public static Book writeBookToArray(Book name, Book arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = name;
                break;
            }
        }
        return name;
    }

    public static Book printBooks (Book arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBookTitle());
            System.out.println(arr[i].getBookAuthor());
            System.out.println(arr[i].getBookReleaseYear());
        }
        return null;
    }


    public static void main(String[] args) {
        Book[] books = new Book[3];
        // 1-я книга
        String bookTitle = "Сияние";
        String nameAuthor = "Стивен";
        String surnameAuthor = "Кинг";
        int bookReleaseYear = 2016;
        Book theShining = new Book(bookTitle, new Author(nameAuthor, surnameAuthor), bookReleaseYear);
        writeBookToArray(theShining, books);
        theShining.setBookReleaseYear(2000);
        // 2-я книга
        bookTitle = "Мастер и Маргарита";
        nameAuthor = "Михаил";
        surnameAuthor = "Булгаков";
        bookReleaseYear = 2020;
        Book masterAndMargarita = new Book(bookTitle, new Author(nameAuthor, surnameAuthor), bookReleaseYear);
        writeBookToArray(masterAndMargarita, books);
        // 3-я книга
        bookTitle = "Гарри Поттер и филосовский камень";
        nameAuthor = "Джоан";
        surnameAuthor = "Роулинг";
        bookReleaseYear = 2000;
        Book harryPotter = new Book(bookTitle, new Author(nameAuthor, surnameAuthor), bookReleaseYear);
        writeBookToArray(harryPotter, books);
        printBooks(books);
    }
}
