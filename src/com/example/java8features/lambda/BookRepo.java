package com.example.java8features.lambda;


import com.example.java8features.lambda.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepo {

    public List<Book> getListofbooks() {

        List<Book> listofbooks = new ArrayList<Book>();
        listofbooks.add(new Book(1, "Java", 100));
        listofbooks.add(new Book(2, "Python", 300));
        listofbooks.add(new Book(3, "Web Programming", 200));
        listofbooks.add(new Book(4, "Web Socket", 400));

        return listofbooks;


    }


}
