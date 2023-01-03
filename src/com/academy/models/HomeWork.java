package com.academy.models;

public class HomeWork extends SuperModels {
    private static long ID;
    private static long counter;

    public HomeWork() {
        ID = counter++;
    }

    public static long getID() {
        return ID;
    }

    public static void setID(long ID) {
        HomeWork.ID = ID;
    }

    public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        HomeWork.counter = counter;
    }
}

