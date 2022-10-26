package models;

public class Students {
    private static long ID;
    public static long counter;

    public Students() {
        ID = counter++;
    }
}

