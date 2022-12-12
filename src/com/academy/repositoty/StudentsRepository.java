package com.academy.repositoty;

import com.academy.models.Student;

public class StudentsRepository {private final int INIT_CAPACITY = 5;
    private Student[] studentsArray;

    public StudentsRepository() {
        this.studentsArray = new Student[INIT_CAPACITY];
    }

    public StudentsRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standart capacity array");
            this.studentsArray = new Student[INIT_CAPACITY];
        } else {
            this.studentsArray = new Student[inputCapacity];
        }
    }
}
