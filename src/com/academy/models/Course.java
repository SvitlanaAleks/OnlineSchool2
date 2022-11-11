package com.academy.models;

public class Course {
    private int ID;
    public static long counter;
    public String name;

    public Course(int ID, String name) {
        this.ID = ID;
        this.name = name;
        counter++;
    }

    public int getID() {
        return ID;
    }
}







