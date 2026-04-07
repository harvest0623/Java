package com.hh;

public class Service {
    public static void display(Order order){
        for(Book book:order.getBooks()){
            System.out.println(book.getName() + " " + book.getPrice());
        }
    }

    public static void pay(Order order){
        System.out.println("支付成功！"+ order.getTotalPrice());
    }
}