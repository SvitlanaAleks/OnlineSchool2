package com.academy;

import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.repositoty.CoursesRepository;
import com.academy.repositoty.LecturesRepository;
import com.academy.services.LectureService;

import java.util.Arrays;
import java.util.Scanner;

import static com.academy.repositoty.LecturesRepository.lectureArray;
import static com.academy.repositoty.LecturesRepository.newLectureArray;


public class Main {

    public static void main(String[] args) {

        LecturesRepository lecturesRepository = new LecturesRepository();
        LecturesRepository.addLecture(new Lecture("Знайомство з Java", "Nikita", Course.getID()));
        LecturesRepository.addLecture(new Lecture("Знайомство з QA", "Nikita", Course.getID()));
        LecturesRepository.addLecture(new Lecture("Знайомство з Java", "Nikita", Course.getID()));
        LecturesRepository.addLecture(new Lecture("Знайомство з QA", "Nikita", Course.getID()));


        //initData(lecturesRepository);


        while (true) {


            Course course1 = new Course("JavaDeveloper", "Anna May", "Знайомство з Java");
            Course course2 = new Course("Python", "Nick Jagger", " Знайомство з Python");


            LectureService lectureService = new LectureService();


            Scanner sc = new Scanner(System.in);

            int numberOfCategory = 0;
            do {
                System.out.println("Виберіть категорію:");
                System.out.println("1. Курси");
                System.out.println("2. Вчителі");
                System.out.println("3. Студенти");
                System.out.println("4. Лекції");
                numberOfCategory = sc.nextInt();


            } while (numberOfCategory < 1 || numberOfCategory > 4);

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
                while (true) {

                    System.out.println("\n" + "Бажаєте створити ще одну лекцію?");
                    System.out.println("1 Так" + "\n" + "2 Ні ");

                    Scanner sc2 = new Scanner(System.in);
                    int answer = sc2.nextInt();

                    if (answer == 1) {


                        System.out.println("Введіть тему лекції: ");
                        String nameLecture = sc2.next();
                        System.out.println("Тема лекції: " + nameLecture);

                        System.out.println("Введіть викладача: ");
                        String teacherName = sc2.next();

                        System.out.println("Ім'я викладача: " + teacherName);

                        System.out.println("Введіть id курсу:" +
                                "\n" + "1 " + course1.courseName +
                                "\n" + "2 " + course2.courseName);
                        int numberOfCourse = sc2.nextInt();
                        if (numberOfCourse == 1) {
                            System.out.println("Id курсу: " + course1.getID());
                        } else if (numberOfCourse == 2) {
                            System.out.println("Id курсу: " + course2.getID());
                        }

                        Lecture lecture = new Lecture(nameLecture, teacherName, Course.getID());
                        LecturesRepository.addLecture(lecture);
                        System.out.println(lecture);
                        System.out.println(Arrays.toString(lectureArray));
                        System.out.println(LecturesRepository.newCapacity);
                        System.out.println(newLectureArray.length);


                        System.out.printf("Назва лекції: " + nameLecture +
                                "\n" + " Ім'я викладача: " + teacherName +
                                "\n" + " Id лекції: " + Lecture.getLectureID() +
                                "\n" + " Id курсу: " + Course.getID());


                        System.out.println("\n" + "Загальна кількість створених лекцій - " + Lecture.getCounter() + " лекцій.");
//
//                        if (Lecture.getCounter() > 7) {
//                            System.exit(0);
//                                                }
                        if (Lecture.getCounter() == lectureArray.length) {
                            System.out.println("full of 5");
                            LecturesRepository.increaseCapacity();
                            break;

                        }


                    } else if (answer == 2) {
                        System.out.println("Ще одну лекцію не буде створено!");

                        System.out.println("Загальна кількість створених лекцій - " + Lecture.getCounter() + " лекцій.");
                        break;

                    }
                }
            }
        }
    }
}


//    public static void initData(LecturesRepository а) {
//        Course course = new Course("QA", "Nikita", "Знайомство з QA");
//
//        Lecture lecture = new Lecture("Знайомство з Java", "Nikita", Course.getID());
//        Lecture lecture2 = new Lecture("Змінні та операції над ними", "Nikita", Course.getID());
//        Lecture lecture3 = new Lecture("Типи даних та модифікатори доступу", "Nikita", Course.getID());
//
//    }
//
//    public static void showArray(Lecture[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + "" + Lecture.getLectureID());
//            System.out.println(Arrays.toString(a));
//        }










































