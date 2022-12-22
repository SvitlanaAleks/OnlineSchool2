package com.academy.repositoty;

import com.academy.models.HomeWork;

public class HomeWorksRepository extends SuperRepository {
    private final int INIT_CAPACITY = 5;
    private HomeWork[] homeWOrkArray;

    public HomeWorksRepository() {
        super(1);

        this.setHomeWOrkArray(new HomeWork[INIT_CAPACITY]);
    }

    public HomeWorksRepository(int inputCapacity) {
        super(1);
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standard capacity array");
            this.setHomeWOrkArray(new HomeWork[INIT_CAPACITY]);
        } else {
            this.setHomeWOrkArray(new HomeWork[inputCapacity]);
        }
    }

    public int getINIT_CAPACITY() {
        return INIT_CAPACITY;
    }

    public HomeWork[] getHomeWOrkArray() {
        return homeWOrkArray;
    }

    public void setHomeWOrkArray(HomeWork[] homeWOrkArray) {
        this.homeWOrkArray = homeWOrkArray;
    }
}
