package com.day6.model;

public class GenericPrint<T> {
    private T obj;

    public GenericPrint(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
