package com.Day8.collactions;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer>treeMap = new TreeMap<>();
        treeMap.put("Sunday",1);
        treeMap.put("Monday",2);
        treeMap.put("Tuesday",3);
        treeMap.put("Wednesday",4);
        treeMap.put("Thursday",5);
        treeMap.put("Friday",6);
        treeMap.put("Saturday",7);

        System.out.println(treeMap);
    }
}
