package com.academy;

import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.services.LectureService;

public class Main {

    public static void main(String[] args) {
//       Lecture lecture1 = new Lecture();
//       Lecture lecture2 = new Lecture();
//       Lecture lecture3 = new Lecture();
//       Lecture lecture4 = new Lecture();
//       Lecture lecture5 = new Lecture();

        // 6 лекція "Методи"

        Course course1 = new Course(1, "Methods");
        //Course course2 = new Course(32, "hh");


        LectureService lectureService = new LectureService();


        Lecture lecture1 = lectureService.createLecture(1, "Знайомство з Java", course1.getID());
        Lecture lecture2 = lectureService.createLecture(2, "Змінні та операції над ними", course1.getID());
        Lecture lecture3 = lectureService.createLecture(3, "Типи даних та модифікатори доступу", course1.getID());
        Lecture lecture4 = lectureService.createLecture(4, "Git - структура", course1.getID());
        Lecture lecture5 = lectureService.createLecture(5, "Git - планування релізів", course1.getID());
        Lecture lecture6 = lectureService.createLecture(6, "Методи", course1.getID());


        System.out.println(lecture6.getCourseId());
        System.out.println(Lecture.counter);
    }
}

