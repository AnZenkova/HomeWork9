package com.company;

public class Main {

    public static void main(String[] args) {
        Book theShining = new Book("The Shining", "Stiven King", 2016);
        System.out.println("theShining = " + theShining.getBookAuthor());
        theShining.setBookReleaseYear(2000);
        System.out.println("theShining = " + theShining.getBookReleaseYear());

    }
}
