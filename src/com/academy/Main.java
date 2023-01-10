package com.academy;

import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.repositoty.LecturesRepository;
import com.academy.services.LectureService;
import com.academy.services.MainService;

import java.util.Scanner;


public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LecturesRepository lecturesRepository = new LecturesRepository();
        LectureService lectureService=new LectureService();
        LecturesRepository.addLecture(new Lecture(1,"Знайомство з Java", "Nikita", Course.getID()));
        LecturesRepository.addLecture(new Lecture(2,"Знайомство з QA", "Nikita", Course.getID()));
        LecturesRepository.addLecture(new Lecture(3,"Знайомство з Java", "Nikita", Course.getID()));
        LecturesRepository.addLecture(new Lecture(4,"Знайомство з QA", "Nikita", Course.getID()));

            Course course1 = new Course("JavaDeveloper", "Anna May", "Знайомство з Java");
            Course course2 = new Course("Python", "Nick Jagger", " Знайомство з Python");


           MainService.switchCategory();
           MainService.workWithLecture();}}







































