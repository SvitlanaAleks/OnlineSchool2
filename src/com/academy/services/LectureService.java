package com.academy.services;

import com.academy.models.Course;
import com.academy.models.Lecture;

public class LectureService {
    private static long ID;
    public static long counter;
    private int courseId;

    public Lecture createLecture(int ID, String nameLecture, int courseId) {
        return new Lecture(ID, nameLecture, courseId);
    }

}
