package com.academy.repositoty;

import com.academy.models.Lecture;

public class SuperRepository {

    private final int INIT_CAPACITY = 5;
    private Lecture[] myArray;

    SuperRepository[] getAll(SuperRepository[] myArray) {
        return myArray;
    }

    public void add(Lecture object) {
        getMyArray()[0] = object;
    }

    public void getByld() {
        System.out.println(getMyArray()[0]);
    }

    public void deleteByld() {
        getMyArray()[0] = null;
    }

    private int id;

    private int counter;

    public SuperRepository(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Lecture[] getMyArray() {
        return myArray;
    }

    public void setMyArray(Lecture[] myArray) {
        this.myArray = myArray;

        }}