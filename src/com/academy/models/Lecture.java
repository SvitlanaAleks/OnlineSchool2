package com.academy.models;

public class Lecture {
    public static int ID;
    public static long counter;

    public static int courseId;
    private String nameLecture;

    private String teacherName;



    public Lecture(int ID, String nameLecture, String teacherName, int courseId) {
        this.ID = ID;
        this.nameLecture = nameLecture;
        this.teacherName=teacherName;
        this.courseId = courseId;
        counter++;
    }

    public int getCourseId() {
        return this.courseId;
    }

}
















