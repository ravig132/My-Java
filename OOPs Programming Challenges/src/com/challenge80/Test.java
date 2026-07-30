package com.challenge80;

public class Test {
    public static  void main ( String [] args) {
        libraryItem Item1 = new libraryItem();
        Book book1 = new Book();
        Magazines magazine1 = new Magazines();
        DVD dvd1 = new DVD();

        Item1.checkout();
        book1.returnItem();
        magazine1.checkout();
        dvd1.returnItem();

    }
}
