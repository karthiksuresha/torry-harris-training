package com.Day8.collactions;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abcd");
        linkedHashSet.add("efgh");
        linkedHashSet.add("ABCD");
        linkedHashSet.add("India");

        System.out.println(linkedHashSet);
    }
}
