package com.academy.models;

public class Course {
    public  int courseId;
    public static long counter;
    public String courseName;
    public String teacher;
    private String lecture;

    public Course(int courseId, String courseName, String teacher, String lecture) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher=teacher;
        this.lecture=lecture;

        counter++;
    }

    public int getID() {return courseId;
    }


    }








