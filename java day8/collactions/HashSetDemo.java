package com.Day8.collactions;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("abcd");
        stringHashSet.add("efgh");
        stringHashSet.add("ABCD");
        stringHashSet.add("India");

        System.out.println(stringHashSet);
        System.out.println(stringHashSet.contains("abcd"));

        HashSet<Integer> integerHashSet =new HashSet<>();
        integerHashSet.add(10);
        integerHashSet.add(50);
        integerHashSet.add(30);
        integerHashSet.add(100);
        integerHashSet.add(70);

        System.out.println(integerHashSet);

        HashSet<Float> floatHashSet =new HashSet<>();
        floatHashSet.add(10.1f);
        floatHashSet.add(50.6f);
        floatHashSet.add(30.84f);
        floatHashSet.add(10.650f);
        floatHashSet.add(70.86f);

        System.out.println(floatHashSet);
    }
}
