package com.example.ksd;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    private static ObservableList<Book> cartItems = FXCollections.observableArrayList();

    public static void addBook(Book book) {
        cartItems.add(book);
    }

    public static ObservableList<Book> getCartItems() {
        return cartItems;
    }
}