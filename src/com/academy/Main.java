package com.academy;

import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.services.LectureService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // 6 лекція "Методи"

        Course course1 = new Course(1, "JavaDeveloper", "Anna May", "Знайомство з Java");
        Course course2 = new Course(8, "Python", "Nick Jagger", " Знайомство з Python");


        LectureService lectureService = new LectureService();


        Lecture lecture1 = lectureService.createLecture(1, "Знайомство з Java", "Nikita", course1.getID());
        Lecture lecture2 = lectureService.createLecture(2, "Змінні та операції над ними", "Nikita", course2.getID());
        Lecture lecture3 = lectureService.createLecture(3, "Типи даних та модифікатори доступу", "Nikita", course1.getID());
        Lecture lecture4 = lectureService.createLecture(4, "Git - структура", "Nikita", course1.getID());
        Lecture lecture5 = lectureService.createLecture(5, "Git - планування релізів", "Nikita", course1.getID());
        Lecture lecture6 = lectureService.createLecture(6, "Методи", "Nikita", course1.getID());


        System.out.println(lecture6.getCourseId());
        System.out.println(Lecture.counter);

        Scanner sc = new Scanner(System.in);

        System.out.println("Select a category:");
        System.out.println("1. Courses");
        System.out.println("2. Teachers");
        System.out.println("3. Students");
        System.out.println("4. Lectures");
        int numberOfCategory = sc.nextInt();

        switch (numberOfCategory) {
            case 1 -> System.out.println("You selected the category: Courses");
            case 2 -> System.out.println("You selected the category: Teachers");
            case 3 -> System.out.println("You selected the category: Students");
            case 4 -> System.out.println("You selected the category: Lectures");
            default -> System.out.println("Such category does not exist!");
        }
        if (numberOfCategory !=4){
            System.out.println("Розділ в режимі наповлення");}
        else {
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Введіть тему лекції: ");
        String nameLecture = sc2.next();
        System.out.println("Тема лекції: " + nameLecture);

        System.out.println("Введіть викладача: ");
        String teacherName = sc2.next();

        System.out.println("Ім'я викладача: " + teacherName);

        System.out.println("Введіть id лекції: ");
        Lecture.ID = sc2.nextInt();
        System.out.println("Id лекції: " + Lecture.ID);

        System.out.println("Введіть id курсу: ");
        Course.Id = sc2.nextInt();
        System.out.println("Id курсу: " + Course.Id);

        System.out.println("Id лекції: " + Course.Id);

        Lecture lecture = new Lecture(Lecture.ID, nameLecture, teacherName, Course.Id);

        System.out.printf("Назва лекції: " + nameLecture +
                "\n" + " Ім'я викладача: " + teacherName +
                "\n" + " Id лекції" + Lecture.ID +
                "\n" + " Id курсу: " + Course.Id);

        System.out.println("Lection id:" + lecture.getCourseId());


        System.out.println("\n" + "Бажаєте створити ще одну лекцію?");
        System.out.println("1 Так" + "\n" + "2 Ні ");

        int toBeOrNotToBe = sc2.nextInt();

        if (toBeOrNotToBe == 1) {
            System.out.println("Введіть тему лекції: ");
            String nameLectureNext = sc2.next();
            System.out.println("Тема лекції: " + nameLecture);

            System.out.println("Введіть викладача: ");
            String teacherNameNext = sc2.next();

            System.out.println("Ім'я викладача: " + teacherName);

            System.out.println("Введіть id лекції: ");
            Lecture.ID = sc2.nextInt();
            System.out.println("Id лекції: " + Lecture.ID);

            System.out.println("Введіть id курсу: ");
            Lecture.courseId = sc2.nextInt();
            System.out.println("Id курсу: " + Lecture.courseId);

            System.out.println("Id лекції: " + Lecture.courseId);

            Lecture lectureNext = new Lecture(Lecture.ID, nameLecture, teacherName, Lecture.courseId);

            System.out.printf("Назва лекції: " + nameLecture +
                    "\n" + " Ім'я викладача: " + teacherName +
                    "\n" + " Id лекції" + Lecture.ID +
                    "\n" + " Id курсу: " + Lecture.courseId);


            System.out.println("Lection id:" + lecture.getCourseId());
        } else if (toBeOrNotToBe == 2) {
            System.out.println("Ще одну лекцію не буде створено!");


            sc.close();
            sc2.close();
        }
    }}}

















