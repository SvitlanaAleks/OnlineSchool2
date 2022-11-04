package com.academy.models;

public class Course {

    private static long ID;
    public static long counter;

    public Course() {
        ID = counter++;
    }
}
