package com.example.java8features.lambda;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class BookService {
    public List<Book> getBook() {
        List listofbooks = new BookRepo().getListofbooks();
        return listofbooks;
    }

    public List<Book> getBookinsorted() {
        List<Book> listofbooks = new BookRepo().getListofbooks();
        //Collections.sort(listofbooks,((o1, o2) -> o1.getName().compareTo(o2.getName())));
        Collections.sort(listofbooks, ((o1, o2) -> o1.getPage() - o2.getPage()));
        return listofbooks;
    }


    public void getConditionalPageNumber(){
        List<Book> listofbooks = new BookRepo().getListofbooks();
        List<Book> listofbooks2= listofbooks.stream()
                .filter(p->p.getName().startsWith("W")).collect(Collectors.toList());
                //.forEach(p-> System.out.println(p.getName()+"  "+   p.getPage()));
        System.out.println(listofbooks2);

        System.out.println(listofbooks.stream().anyMatch(p->p.getName().startsWith("W")));

    }
    public double getAveragePageNumber() {

        List<Book> listofbooks = new BookRepo().getListofbooks();
        //System.out.println(listofbooks.stream().limit(2).collect(Collectors.toList()));
      // return  listofbooks.stream().mapToInt(books->books.getPage()).max();
       return listofbooks.stream().mapToInt(books->books.getPage()).average().getAsDouble();
    }

    public static void main(String[] args) {
       // System.out.println(new BookService().getAveragePageNumber());
        new BookService().getConditionalPageNumber();
    }


}
