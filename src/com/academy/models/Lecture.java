package com.academy.models;

public class Lecture extends SuperModels {
    private static int ID;
    private static long counter;

    private static int courseId;

    private String nameLecture;

    private String teacherName;


    public Lecture(String nameLecture, String teacherName, int courseId) {
        this.setNameLecture(nameLecture);
        this.setTeacherName(teacherName);
        this.setCourseId(courseId);
        ID++;
        counter++;
    }

    public static int getLectureID() {
        return ID;
    }

    public static void setLectureId(int Id) {
        Lecture.ID = ID;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        Lecture.courseId = courseId;
    }


    public static long getCounter() {
        return counter;
    }

    public String getNameLecture() {
        return nameLecture;
    }

    public String getTeacherName() {
        return teacherName;}

    public void setNameLecture(String nameLecture) {
        this.nameLecture = nameLecture;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}

















