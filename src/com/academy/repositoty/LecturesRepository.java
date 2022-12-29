package com.academy.repositoty;

import com.academy.models.Lecture;

import java.util.Arrays;

public class LecturesRepository extends SuperRepository {
    public static final int INIT_CAPACITY = 5;
    public static Lecture[] lectureArray;
    public static int newCapacity;
    public static Lecture[] newLectureArray;


    public LecturesRepository() {
        super(1);
        this.lectureArray = new Lecture[INIT_CAPACITY];
        this.newLectureArray = new Lecture[newCapacity];

    }

    public static void addLecture(Lecture fillIn) {
        for (int i = 0; i < lectureArray.length; i++) {
            if (lectureArray[i] != null) {
                continue;
            }
            lectureArray[i] = fillIn;
            break;
        }
    }


    public static void increaseCapacity() {
        int newCapacity = (INIT_CAPACITY * 3 / 2 + 1);
        Lecture[] newLectureArray = new Lecture[newCapacity];
        System.arraycopy(lectureArray, 0, newLectureArray, 0, INIT_CAPACITY);
        lectureArray = newLectureArray;
    }
}

//
//
//    }
//
//    public int getINIT_CAPACITY() {
//        return INIT_CAPACITY;
//    }
//
//    public Lecture[] getLectureArray() {
//        return lectureArray;
//    }
//
//    @Override
//    public void add(Lecture object) {
//        lectureArray[0] = object;
//    }
//    @Override
//    SuperRepository[] getAll(SuperRepository[] myArray) {
//        return super.getAll(myArray);
//    }
//    @Override
//    public void getByld() {
//        super.getByld();
//    }
//
//    @Override
//    public void deleteByld() {
//        super.deleteByld();
//    }
