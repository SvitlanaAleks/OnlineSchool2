package com.academy.models;

public class Additionalmaterial extends SuperModels{

    private static long ID;
    private static long counter;

    public Additionalmaterial() {
        ID = counter++;
    }

    public static long getID() {
        return ID;
    }

    public static void setID(long ID) {
        Additionalmaterial.ID = ID;
    }

    public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        Additionalmaterial.counter = counter;
    }

}
