package com.Day4.model;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Tiger implements Mammal{

    @Override
    public void feed() {
        System.out.println("Tiger is feeding to his cub");
    }

    @Override
    public void eat() {
        System.out.println("Cub is eating mutton");
    }
}
