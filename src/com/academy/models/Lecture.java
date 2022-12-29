package com.academy.models;

public class Lecture extends SuperModels {
    private int ID;
    private static long counter;

    private static int courseId;

    private String nameLecture;

    private String teacherName;


    public Lecture(int ID, String nameLecture, String teacherName, int courseId) {
        this.ID = ID;
        this.setNameLecture(nameLecture);
        this.setTeacherName(teacherName);
        this.setCourseId(courseId);

        counter++;
    }

    public int getLectureID() {
        return ID;
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
        return teacherName;
    }

    public void setNameLecture(String nameLecture) {
        this.nameLecture = nameLecture;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Lecture {" +
                "idLecture=" + getLectureID() + "course id" + getCourseId();
    }

}


















