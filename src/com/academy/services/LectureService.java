package com.academy.services;

import com.academy.models.Lecture;

import static com.academy.repositoty.LecturesRepository.lectureArray;

public class LectureService {
    public static long ID;
    public static long counter;
    private static long elements;
    public int courseId;

    public Lecture createLecture(int ID, String nameLecture, String teacherName, int courseId) {
        return new Lecture(ID, nameLecture, teacherName, courseId);
    }

    public static void showIDLecture() {
        for (Lecture elements : lectureArray) {
            System.out.println("ID Lecture " + elements.getLectureID());

        }
    }
}







