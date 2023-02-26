package com.example.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberInLIst {
    public static void main(String[] args) {
        List<Integer> listofintegers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listofintegers.add(i);
        }
        System.out.println(listofintegers);
        List<Integer> listofevenintegers =
                listofintegers.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(listofevenintegers);
    }
}
