package com.academy.models;

public class Lecture {
    private int ID;
    public static long counter;
    private int courseId;
    public String nameLecture;

    public Lecture(int ID, String nameLecture, int courseId) {
        this.ID = ID;
        this.nameLecture = nameLecture;
        this.courseId = courseId;
        counter++;
    }

    public int getCourseId() {
        return this.courseId;
    }

}
















