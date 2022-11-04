package com.academy;


import com.academy.models.Course;
import com.academy.models.Lecture;

public class Main {

    public static void main(String[] args) {
        Lecture lecture1 = new Lecture();
        Lecture lecture2 = new Lecture();
        Lecture lecture3 = new Lecture();

        Lecture lecture4 = new Lecture();
        Lecture lecture5 = new Lecture();

        // 6 лекція "Методи"
        Course course1 = new Course();

        Lecture lecture6 = new Lecture();
        lecture6.idCourses = "course1";

        Lecture lecture7 = new Lecture();
        lecture7.idCourses = "course2";

        Lecture lecture8 = new Lecture();
        lecture8.idCourses = "course3";

        Lecture lecture9 = new Lecture();
        lecture9.idCourses = "course4";

        Lecture lecture10 = new Lecture();
        lecture10.idCourses = "course5";

        Lecture lecture11 = new Lecture();
        lecture11.idCourses = "course6";

        Lecture lecture12 = new Lecture();
        lecture12.idCourses = "course7";


        System.out.println(Lecture.counter);

        System.out.println(lecture8.idCourses);


    }

}