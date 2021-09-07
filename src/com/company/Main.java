package com.company;

import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Book book = new Book();
            Scanner scanner = new Scanner(System.in);
            String num;
            do {
                System.out.println("If u want to add a book enter '1' ");
                System.out.println("If u want to exit enter '0' ");
                num = scanner.next();
                if (num.equals("1")) {
                    System.out.print("Enter author of the book ");
                    String author = scanner.next();
                    book.setnaddauthor(author);
                    System.out.print("Enter the name of the book ");
                    String bookname = scanner.next();
                    book.setnaddbookname(bookname);
                    System.out.print("Enter year of creation of the book ");
                    String yearofcreation = scanner.next();
                    book.setnaddyearofcreation(yearofcreation);
                    System.out.print("Enter the number of pages of the book ");
                    String numberofpages = scanner.next();
                    book.setnaddnumberofpages(numberofpages);
                    for (int j = 0; j < book.retnum(); j++) {
                        book.setj(j);
                        System.out.println(book);
                    }
                }
            } while (!num.equals("0"));
        }
    }