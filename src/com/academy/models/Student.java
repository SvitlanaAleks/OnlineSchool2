package com.academy.models;

public class Student extends SuperModels {


    private static long ID;
    private static long counter;

    public Student() {
        ID = counter++;
    }

    public static long getID() {
        return ID;
    }

    public static long getCounter() {
        return counter;
    }

    public static void setID(long ID) {
        Student.ID = ID;
    }

    public static void setCounter(long counter) {
        Student.counter = counter;
    }
}

