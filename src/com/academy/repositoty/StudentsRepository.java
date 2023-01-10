package com.academy.repositoty;

import com.academy.models.Student;

public class StudentsRepository extends SuperRepository {
    private final int INIT_CAPACITY = 5;
    private Student[] studentsArray;

    public StudentsRepository() {

        this.studentsArray = new Student[getINIT_CAPACITY()];
    }

    public StudentsRepository(int inputCapacity) {

        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standard capacity array");
            this.studentsArray = new Student[getINIT_CAPACITY()];
        } else {
            this.studentsArray = new Student[inputCapacity];
        }
    }

    public int getINIT_CAPACITY() {
        return INIT_CAPACITY;
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }
}
