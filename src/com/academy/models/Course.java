package com.academy.models;

public class Course extends SuperModels {

    private static int ID;

    private static long counter;

    private String courseName;
    private String teacher;
    private String lecture;

    public Course(String courseName, String teacher, String lecture) {

        this.setCourseName(courseName);
        this.setTeacher(teacher);
        this.setLecture(lecture);
        ID++;
        counter++;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Course.ID = ID;
    }

    public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        Course.counter = counter;
    }

    public  String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;

    }
}








