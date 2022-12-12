package com.academy.repositoty;

import com.academy.models.Course;

public class CoursesRepository {
    private final int INIT_CAPACITY = 5;
    private Course[] courseArray;

    public CoursesRepository() {
        this.courseArray = new Course[INIT_CAPACITY];
    }

    public CoursesRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standart capacity array");
            this.courseArray = new Course[INIT_CAPACITY];
        } else {
            this.courseArray = new Course[inputCapacity];
        }
    }
}
