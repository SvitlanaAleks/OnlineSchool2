package com.academy.repositoty;

import com.academy.models.Course;
import com.academy.models.Lecture;

public class LecturesRepository {
    public int INIT_CAPACITY = 5;
    public Lecture[] lectureArray;


    public LecturesRepository() {
        this.lectureArray = new Lecture[INIT_CAPACITY];
    }


    public LecturesRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standard capacity array");
            this.lectureArray = new Lecture[INIT_CAPACITY];
        } else {
            this.lectureArray = new Lecture[inputCapacity];
        }
        System.out.println(lectureArray.length);
    }


    private void increaseCapacity() {
        int tmpCapacity = INIT_CAPACITY;
        INIT_CAPACITY = (INIT_CAPACITY * 3) / 2 + 1;
        Lecture[] tmp = new Lecture[INIT_CAPACITY];
        System.arraycopy(lectureArray, 0, tmp, 0, INIT_CAPACITY);
        lectureArray = tmp;


    }
}




