package com.javaconcepts.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rajat");
        list.add("Girish");
        list.add("Ram");
        list.add("Sid");
        list.add("Tim");
        list.add("Ted");
        list.add("Vir");
        list.add("Kate");
        list.add("Luna");
        list.forEach(
                (item) -> System.out.println(item)
        );
    }
}
