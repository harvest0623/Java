package com.hh;

import java.util.List;

public class Order {
    private List<Book> Books;
    double totalPrice;
    public void setBooks(List<Book> Books) {
        this.Books = Books;
    }

    public void setTotalPrice(){
        double totalPrice=0;
        for(Book book: Books){
            totalPrice+=book.getPrice();
        }
        this.totalPrice=totalPrice;
    }

    public List<Book> getBooks() {
        return Books;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}