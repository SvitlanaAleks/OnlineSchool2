package com.academy.models;

public class Courses {

    private static long ID;
    public static long counter;

    public Courses() {
        ID = counter++;
    }
}
