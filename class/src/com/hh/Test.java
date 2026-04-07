package com.hh;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        for(int i=0;i<10;++i){
            Book book = new Book("book"+i, i*10);
            books.add(book);
        }
        Order order = new Order();
        order.setBooks(books);
        order.setTotalPrice();
        Service.display(order);
        Service.pay(order);
    }
}
