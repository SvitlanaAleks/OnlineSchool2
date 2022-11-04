package com.academy.models;

public class Lecture {
    private static long ID;
    public static long counter;
    public String idCourses;
   public Lecture() {
        ID = counter++;
   }
   void whatCourse () {
       System.out.println(idCourses);
   }

}



