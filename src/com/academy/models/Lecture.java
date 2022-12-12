package com.academy.models;

public class Lecture {
    public static int ID;
    public static long counter;

    public static int courseId;
    private String nameLecture;

    private String teacherName;



    public Lecture(String nameLecture, String teacherName, int courseId) {
        this.nameLecture = nameLecture;
        this.teacherName = teacherName;
        this.courseId = courseId;
        ID++;
        counter++;
    }
    public  int getLectureID() {
        return ID;}

    public int getCourseId() {
        return this.courseId;

}}
















