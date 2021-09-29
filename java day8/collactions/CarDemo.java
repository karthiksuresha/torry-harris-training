package com.Day8.collactions;

import com.Day8.model.Car;
import com.Day8.model.Person;

import java.util.*;

public class CarDemo {
    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();
        Car c1 = new Car(1001,"Swift","Petrol",1.6f);
        Car c2 = new Car(1002,"Swift","Petrol",1.2f);
        Car c3 = new Car(1003,"Nexon","Petrol",2.0f);
        Car c4 = new Car(1007,"Dzire","Diesel",1.5f);

        carList.add(c1);
        carList.add(c2);
        carList.add(c3);
        carList.add(c4);

        Iterator<Car> carIterator = carList.iterator();

        while (carIterator.hasNext())
        {
            System.out.println(carIterator.next());
        }
        TreeMap<Float,Car> carTreeMap = new TreeMap<>();
        carTreeMap.put(c1.getPower(),c1);
        carTreeMap.put(c2.getPower(),c2);
        carTreeMap.put(c3.getPower(),c3);
        carTreeMap.put(c4.getPower(),c4);
        System.out.println();
        for(Float key:carTreeMap.keySet())
        {
            System.out.println(carTreeMap.get(key));
        }

        HashMap<String,Car> carHashMap = new HashMap();
        carHashMap.put(c1.getCarName(),c1);
        carHashMap.put(c2.getCarName(),c2);
        carHashMap.put(c3.getCarName(),c3);
        carHashMap.put(c4.getCarName(),c4);
        System.out.println();
        for(String key : carHashMap.keySet())
        {
            System.out.println(carHashMap.get(key));
        }
    }
}
