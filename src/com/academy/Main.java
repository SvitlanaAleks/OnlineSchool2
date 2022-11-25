package com.academy;

import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.services.LectureService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // 6 лекція "Методи"

        Course course1 = new Course(1, "JavaDeveloper","Anna May","Знайомство з Java");
        Course course2=new Course( 8, "Python", "Nick Jager", " Знайомство з Python");



        LectureService lectureService = new LectureService();


        Lecture lecture1 = lectureService.createLecture(1, "Знайомство з Java", course1.getID());
        Lecture lecture2 = lectureService.createLecture(2, "Змінні та операції над ними", course2.getID());
        Lecture lecture3 = lectureService.createLecture(3, "Типи даних та модифікатори доступу", course1.getID());
        Lecture lecture4 = lectureService.createLecture(4, "Git - структура", course1.getID());
       Lecture lecture5 = lectureService.createLecture(5, "Git - планування релізів", course1.getID());
       Lecture lecture6 = lectureService.createLecture(6, "Методи", course1.getID());


        System.out.println(lecture6.getCourseId());
        System.out.println(Lecture.counter);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a category:");
        System.out.println("1. Courses");
        System.out.println("2. Teachers");
        System.out.println("3. Students");
        System.out.println("4. Lectures");

        int numberOfCategory = scanner.nextInt();

        switch (numberOfCategory)
        {
            case 1:
                System.out.println("You selected the category: Courses");
                break;
            case 2:
                System.out.println("You selected the category: Teachers");
                break;
            case 3:
                System.out.println("You selected the category: Students");
                break;
            case 4:
                System.out.println("You selected the category: Lectures");
                break;
            default: System.out.println("Such category does not exist!");
        }

    {


// обрати курс
                System.out.println("Оберіть, будь ласка, курс: " +
                        "\n" + "1 " + course1.courseName  +
                        "\n" + "2 " + course2.courseName);
                Scanner sc = new Scanner(System.in);
                int numberOfTheCourse = sc.nextInt();
                System.out.println("Ви ввели: " + numberOfTheCourse);
                switch (numberOfTheCourse) {
                    case 1 -> System.out.println("Ви обрали курс: " + course1.courseName +
                            "\n" + " Вчитель: " + course1.teacher + course1.courseId);
                    case 2 -> System.out.println("Ви обрали курс: " + course2.courseName);
                    default -> System.out.println("Такого курсу не існує!");
    }
    // обрати лекцію
//        System.out.println("Оберіть, будь ласка, лекцію: " +
//                "/n" + "1 " + lecture1.nameLecture +
//                "/n" + "2 " + course2.courseName);

//        System.out.println("Введіть тему лекції: ");
//        Scanner sc2 = new Scanner(System.in);
//        String nameLecture7 = sc2.nextLine();
//        System.out.println("Тема лекції: " + nameLecture7);
//
//        System.out.println("Введіть ім'я викладача лекції: ");
//        String lectureTeacherName = sc2.nextLine();
//        System.out.println("Ім'я викладача: " + lectureTeacherName);
//
//        System.out.println("Введіть книгу для вивчення теми: ");
//        String lectureMainBook = sc2.nextLine();
//        System.out.println("Книга: " + lectureMainBook);
//
//        System.out.println("Введіть id: ");
//        Course.courseId = sc.nextInt();
//        System.out.println("Id лекції: " + Course.courseId);
//        //Lecture lecture7 =lectureService.createLecture();
//       Course.courseId++;
//        System.out.printf("%s", "Назва лекції " + nameLecture7 +
//                " Ім'я викладача " + lectureTeacherName +
//                " Книга для навчання " + lectureMainBook +
//                " id " + Course.courseId);


    }}}



