package com.academy.repositoty;

import com.academy.models.Course;
import com.academy.models.Lecture;

public class LecturesRepository extends SuperRepository {
    public int INIT_CAPACITY = 5;
    public Lecture[] lectureArray;


    public LecturesRepository() {
        this.lectureArray = new Lecture[getINIT_CAPACITY()];
    }


    public LecturesRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standard capacity array");
            this.lectureArray = new Lecture[getINIT_CAPACITY()];
        } else {
            this.lectureArray = new Lecture[inputCapacity];
        }
        System.out.println(lectureArray.length);
    }


    private void increaseCapacity() {
        int tmpCapacity = (getINIT_CAPACITY()* 3 / 2 + 1);
        Lecture[] tmp = new Lecture[INIT_CAPACITY];
        System.arraycopy(getLectureArray(), 0, tmp, 0, getINIT_CAPACITY());
        lectureArray = tmp;


    }

    public int getINIT_CAPACITY() {
        return INIT_CAPACITY;
    }

    public Lecture[] getLectureArray() {
        return lectureArray;
    }
}




