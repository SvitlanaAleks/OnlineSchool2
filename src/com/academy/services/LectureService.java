package com.academy.services;

import com.academy.models.Lecture;

import static com.academy.repositoty.LecturesRepository.getLectureArray;

public class LectureService {



    public static void showIDLecture() {
        for (Lecture elements: getLectureArray()){
            System.out.println("ID Lecture " + elements.getLectureID());

        }
    }
    public static void showLecture() {
        for (Lecture elements: getLectureArray()){
            System.out.println(elements);
}}

    public static void getByID(int ID) {
        for (Lecture openLecture : getLectureArray()) {
            if (openLecture != null) {
                if (ID==openLecture.getLectureID()) {
                    System.out.println(openLecture);

}}}}

    public static void deleteByID(int ID) {
        for (int i = 0; i < getLectureArray().length; i++) {
            if (getLectureArray()[i] != null) {
                if (ID == getLectureArray()[i].getLectureID()) {
                    getLectureArray()[i] = null;
                }}}}}









