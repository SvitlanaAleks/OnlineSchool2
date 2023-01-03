package com.academy.repositoty;

import com.academy.models.Lecture;

import java.util.Arrays;

public class LecturesRepository extends SuperRepository {
    private static final int INIT_CAPACITY = 5;
    private  static Lecture[] lectureArray;
    private static int newCapacity;
    private  static  Lecture[] newLectureArray;


    public LecturesRepository() {
        super(1);
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

    @Override
    public void add(Lecture object) {
        lectureArray[0] = object;
    }
    @Override
    SuperRepository[] getAll(SuperRepository[] myArray) {
        return super.getAll(myArray);
    }
    @Override
    public void getByld() {
        super.getByld();
    }

    @Override
    public void deleteByld() {
        super.deleteByld();
    }}
