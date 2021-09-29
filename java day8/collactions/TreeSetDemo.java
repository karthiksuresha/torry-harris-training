package com.Day8.collactions;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(20);
        integerTreeSet.add(10);
        integerTreeSet.add(40);
        integerTreeSet.add(1);
        integerTreeSet.add(50);
        integerTreeSet.add(5);
        System.out.println(integerTreeSet);

        TreeSet<Float> treeSet1 = new TreeSet<>();
        treeSet1.add(3.14f);
        treeSet1.add(15.75f);
        treeSet1.add(1.17f);
        treeSet1.add(7.45f);
        treeSet1.add(5.74f);
        treeSet1.add(8.567f);
        System.out.println(treeSet1);



    }
}
