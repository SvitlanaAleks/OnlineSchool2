package com.academy.services;

import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.repositoty.LecturesRepository;

import static com.academy.Main.sc;
import static com.academy.repositoty.LecturesRepository.*;

public class MainService {

    static int numberOfCategory;
    static int numberOfAction;

    public static int switchCategory() {
        System.out.println("Виберіть категорію:");
        System.out.println("1. Курси");
        System.out.println("2. Вчителі");
        System.out.println("3. Студенти");
        System.out.println("4. Лекції");

        return getNumberOfCategory();

    }

    public static void workWithCategory() {
        switch (numberOfCategory) {
            case 1 -> {
                System.out.println("You selected the category: Courses");
            }

            case 2 -> System.out.println("You selected the category: Teachers");
            case 3 -> System.out.println("You selected the category: Students");
            case 4 -> {
                System.out.println("You selected the category: Lectures. Виберіть дію");
                //int numberOfAction=MainService.choiceAction();
                MainService.workWithLecture();
            }
            default -> System.out.println("Such category does not exist!");
        }
    }

    private static int getNumberOfCategory() {
        while (numberOfCategory < 1 || numberOfCategory > 5) {
            numberOfCategory = sc.nextInt();
        }
        return numberOfCategory;

    }

    public static int choiceAction() {
        System.out.println("1 - create new");
        System.out.println("2 - open/edit");
        System.out.println("3 - output all");
        System.out.println("4 - delete");
        System.out.println("5 - exit");
        int numberOfAction = sc.nextInt();
        return numberOfAction;
    }


    public static void workWithLecture() {

        switch (choiceAction()) {
            case 1:

                System.out.println("Введіть тему лекції: ");
                String nameLecture = sc.next();
                //System.out.println("Тема лекції: " + nameLecture);

                System.out.println("Введіть викладача: ");
                String teacherName = sc.next();

                //System.out.println("Ім'я викладача: " + teacherName);


                System.out.println("Введіть ID лекції");
                int ID = sc.nextInt();

                Lecture lecture = new Lecture(ID, nameLecture, teacherName, Course.getID());
                LecturesRepository.addLecture(lecture);
                //LectureService.showIDLecture();
                LectureService.showLecture();


                System.out.printf("Назва лекції: " + nameLecture +
                        "\n" + " Ім'я викладача: " + teacherName +
                        "\n" + " Id лекції: " + lecture.getLectureID());


                System.out.println("\n" + "Загальна кількість створених лекцій - " + Lecture.getCounter() + " лекцій.");
                System.out.println(Lecture.getCounter());

                if (Lecture.getCounter() == getLectureArray().length) {
                    System.out.println("Full of Massive");
                    LecturesRepository.increaseCapacity();

                    System.out.println("Массив содержит " + getLectureArray().length);
                }
                if (Lecture.getCounter() >= 8) {
                    MainService.workWithLecture();
                } else {
                    MainService.workWithCategory();
                }
            case 2:
                System.out.println("open lecture number");
                int lectureId = sc.nextInt();
                LectureService.getByID(lectureId);
                break;

            case 3:
                System.out.println("the list of lectures");
                LectureService.showLecture();
                break;
            case 4:
                System.out.println("input lecture number");
                lectureId = sc.nextInt();
                LectureService.deleteByID(lectureId);
                LectureService.showLecture();
                break;

            case 5:
                System.out.println("exit");
            break;
            default:
                System.out.println("Error");
                break;
        }}}











