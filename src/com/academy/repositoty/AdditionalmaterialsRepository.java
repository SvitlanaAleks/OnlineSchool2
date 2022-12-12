package com.academy.repositoty;

import com.academy.models.Additionalmaterial;

public class AdditionalmaterialsRepository {

    private final int INIT_CAPACITY = 5;
    private Additionalmaterial[] addMaterialsArray;

    public AdditionalmaterialsRepository() {
        this.addMaterialsArray = new Additionalmaterial[INIT_CAPACITY];
    }

    public AdditionalmaterialsRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standart capacity array");
            this.addMaterialsArray = new Additionalmaterial[INIT_CAPACITY];
        } else {
            this.addMaterialsArray = new Additionalmaterial[inputCapacity];
        }
    }}