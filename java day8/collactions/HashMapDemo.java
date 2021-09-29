package com.Day8.collactions;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> students = new HashMap<>();
        students.put(1001,"Ram");
        students.put(1002,"Alex");
        students.put(1003,"Amar");
        students.put(1005,"Karan");
        students.put(1004,"Jhon");

        System.out.println(students);

        for(int i : students.keySet())
        {
            System.out.println(i+ ": "+students.get(i));
        }
        System.out.println();
        for(Map.Entry<Integer,String> e : students.entrySet())
        {
            System.out.println(e);
//            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
