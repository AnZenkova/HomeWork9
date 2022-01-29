package com.company;

public class Main {


    public static void main(String[] args) {
        Book[] books = new Book[3];
        Author firstAuthor = new Author("Стивен","Кинг");
        Author secondAuthor = new Author("Михаил", "Булгаков");
        Book firstBook = new Book("Сияние", firstAuthor, 2016);
        writeBookToArray(firstBook, books);
        firstBook.setBookReleaseYear(2000);
        Book secondBook = new Book("Мастер и Мaргарита", secondAuthor, 2020);
        writeBookToArray(secondBook, books);
        Book thirdBook = new Book("Темная Башня. Стрелок", firstAuthor, 2016);
        writeBookToArray(thirdBook, books);
        printBooks(books);
        System.out.println(firstBook);

        printBookByName("Мастер и Маргарита",books);
        changingYearBookByName("Мастер и Маргарита",1999,books);
        printBookByName("Мастер и Маргарита",books);
    }

    private static void writeBookToArray(Book name, Book arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = name;
                break;
            }
        }
    }

    private static void printBooks (Book arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBookTitle());
            System.out.println(arr[i].getBookAuthor());
            System.out.println(arr[i].getBookReleaseYear());
        }
    }

    private static void printBookByName(String name, Book arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (name == arr[i].getBookTitle()){
                System.out.println(arr[i].getBookTitle());
                System.out.println(arr[i].getBookAuthor());
                System.out.println(arr[i].getBookReleaseYear());
            }
        }
    }

    private static void changingYearBookByName(String name,int year, Book arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (name == arr[i].getBookTitle()) {
                arr[i].setBookReleaseYear(year);
            }
        }
    }
}
