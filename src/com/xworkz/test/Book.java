package com.xworkz.test;

public class Book {
    String title;
    String author;
    int price;

    public Book(String title,String author)
    {
      this.title=title;
      this.author=author;
        System.out.println(title);
        System.out.println(author);
    }
    public Book(String title,String author,int price)
    {
        this(title,author);
        this.price=price;
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Book book=new Book("Karvalo","K P Tejaswi");
        Book book1=new Book("Jugari Cross","Kp Tejaswi",200);
    }


}
