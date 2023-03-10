package com.example.java8features.lambda;


import com.example.java8features.lambda.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class BookRepo {

    public List<Book> getListofbooks() {

        List<Book> listofbooks = new ArrayList<Book>();
       // listofbooks.add(new Book(1, "Java", 100).clone());
        listofbooks.add(new Book(2, "Python", 300));
        listofbooks.add(new Book(3, "Web Programming", 200));
        listofbooks.add(new Book(4, "Web Socket", 400));
       // Cloneable

        return listofbooks;


    }


}
