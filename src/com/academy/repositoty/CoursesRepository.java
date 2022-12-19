package com.academy.repositoty;

import com.academy.models.Course;

public class CoursesRepository extends SuperRepository{
    private final int INIT_CAPACITY = 5;
    private Course[] courseArray;

    public CoursesRepository() {

        this.setCourseArray (new Course[getINIT_CAPACITY()]);
    }

    public CoursesRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standard capacity array");
            this.setCourseArray( new Course[getINIT_CAPACITY()]);
        } else {
            this.setCourseArray(new Course[inputCapacity]);
        }
    }

    public int getINIT_CAPACITY() {
        return INIT_CAPACITY;
    }

    public Course[] getCourseArray() {
        return courseArray;
    }

    public void setCourseArray(Course[] courseArray) {
        this.courseArray = courseArray;
    }
}
