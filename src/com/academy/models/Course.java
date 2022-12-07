package com.academy.models;

public class Course {
    public static int ID;
    public static long counter;

    public String courseName;
    private String teacher;
    private String lecture;

    public  Course (String courseName, String teacher, String lecture) {
        this.courseName = courseName;
        this.teacher=teacher;
        this.lecture=lecture;
        ID++;

        counter++;
    }

    public static int getID() {return ID;
    }


    }








