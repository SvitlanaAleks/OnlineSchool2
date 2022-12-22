package com.academy.repositoty;

import com.academy.models.Additionalmaterial;

public class AdditionalmaterialsRepository extends SuperRepository {

    private final int INIT_CAPACITY = 5;
    private Additionalmaterial[] addMaterialsArray;

    public AdditionalmaterialsRepository() {
        super(1);

        this.addMaterialsArray=new Additionalmaterial[getINIT_CAPACITY()];
    }

    public AdditionalmaterialsRepository(int inputCapacity) {
        super(1);
        if (inputCapacity < 1) {
            System.out.println("Wrong argument, creating standart capacity array");
            this.addMaterialsArray= new Additionalmaterial[getINIT_CAPACITY()];
        } else {
            this.addMaterialsArray= new Additionalmaterial[inputCapacity];
        }
    }

    public int getINIT_CAPACITY() {
        return INIT_CAPACITY;
    }

    public Additionalmaterial[] getAddMaterialsArray() {
        return addMaterialsArray;
    }

    public void setAddMaterialsArray(Additionalmaterial[] addMaterialsArray) {
        this.addMaterialsArray = addMaterialsArray;
    }
}