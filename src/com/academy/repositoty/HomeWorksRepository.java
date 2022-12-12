package com.academy.repositoty;

import com.academy.models.HomeWork;

public class HomeWorksRepository {private final int INIT_CAPACITY = 5;
    private HomeWork[] homeWOrkArray;

    public HomeWorksRepository() {
        this.homeWOrkArray = new HomeWork[INIT_CAPACITY];
    }

    public HomeWorksRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standart capacity array");
            this.homeWOrkArray = new HomeWork[INIT_CAPACITY];
        } else {
            this.homeWOrkArray = new HomeWork[inputCapacity];
        }
    }
}
