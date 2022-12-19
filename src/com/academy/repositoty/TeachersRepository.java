package com.academy.repositoty;

import com.academy.models.Teacher;

public class TeachersRepository extends SuperRepository {
    private final int INIT_CAPACITY = 5;
    private Teacher[] teacherArray;

    public TeachersRepository() {
        this.teacherArray = new Teacher[getINIT_CAPACITY()];
    }

    public TeachersRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standart capacity array");
            this.teacherArray = new Teacher[getINIT_CAPACITY()];
        } else {
            this.teacherArray = new Teacher[inputCapacity];
        }
    }

    public int getINIT_CAPACITY() {
        return INIT_CAPACITY;
    }

    public Teacher[] getTeacherArray() {
        return teacherArray;
    }

    public void setTeacherArray(Teacher[] teacherArray) {
        this.teacherArray = teacherArray;
    }
}

