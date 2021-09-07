package com.company;

import java.util.ArrayList;

public class Book {
    private ArrayList<String> author;
    private ArrayList<String> bookname;
    private ArrayList<String> yearofcreation;
    private ArrayList<String> numberofpages;
    private int j;

    public Book() {
        author = new ArrayList<>();
        bookname = new ArrayList<>();
        yearofcreation = new ArrayList<>();
        numberofpages = new ArrayList<>();
    }

    public int retnum(){
        return this.author.size();
    }

    public void setnaddauthor(String author) {
        this.author.add(author);
    }

    public void setnaddbookname(String bookname) {
        this.bookname.add(bookname);
    }

    public void setnaddyearofcreation(String yearofcreation) {
        this.yearofcreation.add(yearofcreation);
    }

    public void setnaddnumberofpages(String numberofpages) {
        this.numberofpages.add(numberofpages);
    }

    public void setj(int j){
        this.j=j;
    }

    @Override
    public String toString() {
            return "Book " + (j+1) +
                    " Author " + author.get(j) +
                    ", Book name " + bookname.get(j) +
                    ", Year of creation " + yearofcreation.get(j) +
                    ", Number of pages " + numberofpages.get(j);
            }
}
