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

//                   switch (numberOfCategory) {
//                case 1 -> {
//                    System.out.println("You selected the category: Courses");
//                }
//
//                case 2 -> System.out.println("You selected the category: Teachers");
//                case 3 -> System.out.println("You selected the category: Students");
//                case 4 -> {System.out.println("You selected the category: Lectures. Виберіть дію");
//               //int numberOfAction=MainService.choiceAction();
//                    MainService.workWithLecture();}
//                default -> System.out.println("Such category does not exist!");}}}
//            }
//            if (numberOfCategory != 4 && numberOfCategory != 1) {
//                System.out.println("Розділ в стані наповнення");
//
//            } else if (numberOfCategory == 1) {
//                System.out.println("Виберіть курс" +
//                        "\n" + "1. " + course1.getCourseName() +
//                        "\n" + "2. " + course2.getCourseName());
//                int numberOfCourse = sc.nextInt();
//                switch (numberOfCourse) {
//                    case 1 -> System.out.println("You selected the Course: JavaDeveloper");
//                    case 2 -> System.out.println("You selected the Course: Python");
//                }
//            } else if (numberOfCategory == 4) {
//                while (true) {
//
//                    System.out.println("\n" + "Бажаєте створити ще одну лекцію?");
//                    System.out.println("1 Так" + "\n" + "2 Ні ");
//
//                    Scanner sc2 = new Scanner(System.in);
//                    int answer = sc2.nextInt();
//
//                    if (answer == 1) {
//
//
//                        System.out.println("Введіть тему лекції: ");
//                        String nameLecture = sc2.next();
//                        System.out.println("Тема лекції: " + nameLecture);
//
//                        System.out.println("Введіть викладача: ");
//                        String teacherName = sc2.next();
//
//                        System.out.println("Ім'я викладача: " + teacherName);
//
//                        System.out.println("Введіть id курсу:" +
//                                "\n" + "1 " + course1.getCourseName() +
//                                "\n" + "2 " + course2.getCourseName());
//                        int numberOfCourse = sc2.nextInt();
//                        if (numberOfCourse == 1) {
//                            System.out.println("Id курсу: " + course1.getID());
//                        } else if (numberOfCourse == 2) {
//                            System.out.println("Id курсу: " + course2.getID());
//                        }
//                        System.out.println("Введіть ID лекції");
//                        int ID=sc2.nextInt();
//
//                        Lecture lecture = new Lecture(ID, nameLecture, teacherName, Course.getID());
//                        LecturesRepository.addLecture(lecture);
//                       LectureService.showIDLecture();
//
//
//
//
//                        System.out.printf("Назва лекції: " + nameLecture +
//                                "\n" + " Ім'я викладача: " + teacherName +
//                                "\n" + " Id лекції: " + lecture.getLectureID() +
//                                "\n" + " Id курсу: " + Course.getID());
//
//
//                        System.out.println("\n" + "Загальна кількість створених лекцій - " + Lecture.getCounter() + " лекцій.");
//
//                        if (Lecture.getCounter() == getNewLectureArray().length) {
//                            System.out.println("full of 8");
//                            LecturesRepository.increaseCapacity();
//
//
//                        }
//
//
//                        } else if (answer == 2) {
//                            System.out.println("Ще одну лекцію не буде створено!");
//
//                            System.out.println("Загальна кількість створених лекцій - " + Lecture.getCounter() + " лекцій.");
//                            break;
//
//                        }
//
//
//                    }
//
//                }
//            }
//        }













































