package com.academy;


import com.academy.models.Courses;
import com.academy.models.Lectures;

public class Main {

    public static void main(String[] args) {
        Lectures lectures = new Lectures();
        Lectures lectures1 = new Lectures();
        Lectures lectures2 = new Lectures();

        Lectures lectures3 = new Lectures();
        Lectures lectures4 = new Lectures();

        // 6 лекція
        Courses courses1=new Courses();

        Lectures lectures5= new Lectures();



        System.out.println(Courses.counter);
        System.out.println(Lectures.counter);


    }

}