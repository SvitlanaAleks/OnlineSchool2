package com.academy.models;

public class Student {
    private static long ID;
    public static long counter;

    public Student() {
        ID = counter++;
    }
}

