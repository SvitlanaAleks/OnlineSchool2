package com.academy.models;

public class Teacher extends SuperModels {
    private static long ID;

    public static long counter;

    public Teacher() {
        ID = counter++;
    }

    public static long getID() {
        return ID;
    }

    public static void setID(long ID) {
        Teacher.ID = ID;
    }

    public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        Teacher.counter = counter;
    }

}
