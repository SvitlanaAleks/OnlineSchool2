package com.academy.models;

public class Course {
    public static int Id;
    public static long counter;

    public String courseName;
    private String teacher;
    private String lecture;

    public Course(int Id, String courseName, String teacher, String lecture) {
        this.Id = Id;
        this.courseName = courseName;
        this.teacher=teacher;
        this.lecture=lecture;

        counter++;
    }

    public static int getID() {return Id;
    }


    }








