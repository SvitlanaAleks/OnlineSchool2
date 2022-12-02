package com.academy.services;

import com.academy.models.Course;
import com.academy.models.Lecture;

public class LectureService {
    public static long ID;
    public static long counter;
    public int courseId;

    public Lecture createLecture(int ID, String nameLecture, String teacherName, int courseId) {
        return new Lecture(ID, nameLecture, teacherName, courseId);
    }

}
