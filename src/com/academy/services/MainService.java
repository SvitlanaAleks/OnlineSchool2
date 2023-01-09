package com.academy.services;

import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.repositoty.LecturesRepository;

import java.util.Scanner;

import static com.academy.Main.sc;
import static com.academy.repositoty.LecturesRepository.getLectureArray;
import static com.academy.repositoty.LecturesRepository.getNewLectureArray;

public class MainService {

    static int numberOfCategory;


    public static int switchCategory() {
        System.out.println("Виберіть категорію:");
        System.out.println("1. Курси");
        System.out.println("2. Вчителі");
        System.out.println("3. Студенти");
        System.out.println("4. Лекції");
        //System.out.println("Exit - select 5");
        //int numberOfCategory  = sc.nextInt();
        return getNumberOfCategory();
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
    return getNumberOfCategory()}

    public static void workWithLecture() {
        switch (choiceAction()) {
            case 1:
           System.out.println("\n" + "Бажаєте створити ще одну лекцію?" +
                   "\n" + "1. ТАК" +
                   "\n" + "2. НІ " );

        int answer = sc.nextInt();

        if (answer == 1) {


            System.out.println("Введіть тему лекції: ");
            String nameLecture = sc.next();
            System.out.println("Тема лекції: " + nameLecture);

            System.out.println("Введіть викладача: ");
            String teacherName = sc.next();

            System.out.println("Ім'я викладача: " + teacherName);


            System.out.println("Введіть ID лекції");
            int ID = sc.nextInt();

            Lecture lecture = new Lecture(ID, nameLecture, teacherName, Course.getID());
            LecturesRepository.addLecture(lecture);
            LectureService.showIDLecture();


            System.out.printf("Назва лекції: " + nameLecture +
                    "\n" + " Ім'я викладача: " + teacherName +
                    "\n" + " Id лекції: " + lecture.getLectureID());


            System.out.println("\n" + "Загальна кількість створених лекцій - " + Lecture.getCounter() + " лекцій.");

            if (Lecture.getCounter() == 5) {
                System.out.println("full of 8");
                LecturesRepository.increaseCapacity();

            }

        } else if (answer == 2) {
            System.out.println("Ще одну лекцію не буде створено!");

            System.out.println("Загальна кількість створених лекцій - " + Lecture.getCounter() + " лекцій.");

        }
    }
}
