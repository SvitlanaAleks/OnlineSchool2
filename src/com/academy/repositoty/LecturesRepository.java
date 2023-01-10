package com.academy.repositoty;

import com.academy.models.Lecture;
import com.academy.models.SuperModels;

import java.util.Arrays;

public class LecturesRepository extends SuperRepository {
    private static final int INIT_CAPACITY = 5;
    private  static Lecture[] lectureArray;
    private static int newCapacity;
    private  static  Lecture[] newLectureArray;


    public LecturesRepository() {

        this.lectureArray = new Lecture[getINIT_CAPACITY()];
        this.newLectureArray = new Lecture[newCapacity];

    }

    public static void addLecture(Lecture fillIn) {
        for (int i = 0; i < getLectureArray().length; i++) {
            if (getLectureArray()[i] != null) {
                continue;
            }
            getLectureArray()[i] = fillIn;
            break;
        }
    }


    public static void increaseCapacity() {
        int newCapacity = (INIT_CAPACITY * 3 / 2 + 1);
        Lecture[] newLectureArray = new Lecture[newCapacity];

        System.arraycopy(getLectureArray(), 0, newLectureArray, 0, INIT_CAPACITY);
        //getLectureArray() = getNewLectureArray();
        lectureArray=newLectureArray;
    }




    public static int getINIT_CAPACITY() {
        return INIT_CAPACITY;
    }

    public  static Lecture[] getLectureArray() {
        return lectureArray;
    }

    public static int getNewCapacity() {
        return newCapacity;
    }

    public  static  Lecture[] getNewLectureArray() {
        return newLectureArray;
    }

//    @Override
//    public void add(Lecture object) {
//        lectureArray[0] = object;
//    }
@Override
public Lecture[] getALL() {
    return lectureArray;
}

    @Override
    public void getByID(int ID) {
        for (SuperModels openLecture : lectureArray) {
            if (openLecture != null) {
                if (ID==openLecture.getId()) {
                    System.out.println(openLecture);
                }
            }
        }
    }

    @Override
    public void deleteByID(int ID) {
        for (int i = 0; i < lectureArray.length; i++) {
            if (lectureArray[i] != null) {
                if (ID == lectureArray[i].getLectureID()) {
                    lectureArray[i] = null;
                }}}}}
