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

        System.out.println("Виберіть категорію:");
        System.out.println("1. Курси");
        System.out.println("2. Вчителі");
        System.out.println("3. Студенти");
        System.out.println("4. Лекції");

        int numberOfCategory = sc.nextInt();

        switch (numberOfCategory) {
            case 1 -> System.out.println("You selected the category: Courses");
            case 2 -> System.out.println("You selected the category: Teachers");
            case 3 -> System.out.println("You selected the category: Students");
            case 4 -> System.out.println("You selected the category: Lectures");
            default -> System.out.println("Such category does not exist!");
        }
        if (numberOfCategory != 4 && numberOfCategory != 1) {
            System.out.println("Розділ в стані наповнення");
        } else if (numberOfCategory == 1) {
            System.out.println("Виберіть курс" +
                    "\n" + "1. " + course1.courseName +
                    "\n" + "2. " + course2.courseName);
            int numberOfCourse = sc.nextInt();
            switch (numberOfCourse) {
                case 1 -> System.out.println("You selected the Course: JavaDeveloper");
                case 2 -> System.out.println("You selected the Course: Python");
            }
        } else if (numberOfCategory == 4) {

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

            System.out.println("Введіть id курсу:" +
                    "\n" + "1 " + course1.courseName +
                    "\n" + "2 " + course2.courseName);
            Course.Id = sc2.nextInt();
            if (Course.Id == 1) {
                System.out.println("Id курсу: " + Course.Id);
            }

            System.out.println("Id лекції: " + Course.Id);


            Lecture lecture = new Lecture(Lecture.ID, nameLecture, teacherName, Course.Id);


            System.out.printf("Назва лекції: " + nameLecture +
                    "\n" + " Ім'я викладача: " + teacherName +
                    "\n" + " Id лекції: " + Lecture.ID +
                    "\n" + " Id курсу: " + Course.Id);

            System.out.println("\n" + "Course id:" + Course.Id);


            System.out.println("\n" + "Бажаєте створити ще одну лекцію?");
            System.out.println("1 Так" + "\n" + "2 Ні ");
            Scanner sc3 = new Scanner(System.in);

            int answer = sc3.nextInt();

            if (answer == 1) {
                System.out.println("Введіть тему лекції: ");
                String nameNewLecture = sc2.next();
                System.out.println("Тема лекції: " + nameNewLecture);

                System.out.println("Введіть викладача: ");
                String teacherNewName = sc2.next();

                System.out.println("Ім'я викладача: " + teacherNewName);

                System.out.println("Введіть id лекції: ");
                Lecture.ID = sc2.nextInt();
                System.out.println("Id лекції: " + Lecture.ID);

                System.out.println("Введіть id курсу:" +
                        "\n" + "1 " + course1.courseName +
                        "\n" + "2 " + course2.courseName);
                Course.Id = sc2.nextInt();
                if (Course.Id == 1) {
                    System.out.println("Id курсу: " + Course.Id);
                }

                System.out.println("Id лекції: " + Course.Id);


                Lecture anotherLecture = new Lecture(Lecture.ID, nameNewLecture, teacherNewName, Course.Id);


                System.out.printf("Назва лекції: " + nameNewLecture +
                        "\n" + " Ім'я викладача: " + teacherNewName +
                        "\n" + " Id лекції: " + Lecture.ID +
                        "\n" + " Id курсу: " + Course.Id);

                System.out.println("\n" + "Lection id:" + anotherLecture.getCourseId());

            } else if (answer == 2) {
                System.out.println("Ще одну лекцію не буде створено!");


                sc.close();
                sc2.close();
                sc3.close();


            }
        }
        System.out.println("Загальна кількість створених лекцій - " + Lecture.counter + " лекцій.");

    }
}


















