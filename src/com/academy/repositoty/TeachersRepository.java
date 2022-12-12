package com.academy.repositoty;

import com.academy.models.Teacher;

public class TeachersRepository {private final int INIT_CAPACITY = 5;
    private Teacher[] teacherArray;

    public TeachersRepository() {
        this.teacherArray = new Teacher[INIT_CAPACITY];
    }

    public TeachersRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standart capacity array");
            this.teacherArray = new Teacher[INIT_CAPACITY];
        } else {
            this.teacherArray = new Teacher[inputCapacity];
        }
    }
}

