package com.academy.repositoty;

import com.academy.models.Lecture;

public class LecturesRepository {private final int INIT_CAPACITY = 5;
    private Lecture[] lectureArray;

    public LecturesRepository() { this.lectureArray = new Lecture[INIT_CAPACITY]; }

    public LecturesRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standart capacity array");
            this.lectureArray = new Lecture[INIT_CAPACITY];
        } else {
            this.lectureArray = new Lecture[inputCapacity];
        }
    }
}
