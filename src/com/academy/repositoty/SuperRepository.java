package com.academy.repositoty;

import com.academy.models.Lecture;
import com.academy.models.SuperModels;

public class SuperRepository {


    private  SuperModels[] arrayRepository = new SuperModels[10];

    public SuperModels[] getALL () {
        return arrayRepository;
    }

    public void add (SuperModels fillIN) {
        for (int i = 0; i < arrayRepository.length; i++) {
            if (arrayRepository[i] != null) {
                continue;
            }
            arrayRepository[i] = fillIN;
            break;
        }
    }

    public void getByID (int ID) {
        for (SuperModels openLecture : arrayRepository) {
            if (openLecture != null) {
                if (ID==openLecture.getId()) {
                    System.out.println(openLecture);
                }
            }
        }
    }//написать override

    public void deleteByID (int ID) {
        for (int i = 0; i < arrayRepository.length; i++) {
            if (arrayRepository[i] != null) {
                if (ID == arrayRepository[i].getId()) {
                    arrayRepository[i] = null;
                }
            }
        }
    }}