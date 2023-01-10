package com.academy.services;

import com.academy.models.Lecture;
import com.academy.models.SuperModels;

import static com.academy.repositoty.LecturesRepository.*;

public class LectureService {
    public static long ID;
    public static long counter;
    private static long elements;
    public int courseId;

//    public Lecture createLecture(int ID, String nameLecture, String teacherName, int courseId) {
//        return new Lecture(ID, nameLecture, teacherName, courseId);


    public static void showIDLecture() {
        for (Lecture elements: getLectureArray()){
            System.out.println("ID Lecture " + elements.getLectureID());

        }
    }
    public static void showLecture() {
        for (Lecture elements: getLectureArray()){
            System.out.println(elements);
}}

    public static void getByID(int ID) {
        for (Lecture openLecture : getLectureArray()) {
            if (openLecture != null) {
                if (ID==openLecture.getLectureID()) {
                    System.out.println(openLecture);

}}}}}







