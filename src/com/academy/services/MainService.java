package com.academy.services;

import static com.academy.Main.SCANNER;

public class MainService {
    private static String checkContinueWorking;
    private static int checkIntNumber;

    private static int readInteger() { //scanner processing for integer
        int id = SCANNER.nextInt();
        feedNewLine();
        return id;
}
    private static void feedNewLine() { //scanner processing for button enter
        SCANNER.nextLine();
    }

    public static int choiceCategory() {
        System.out.println("Виберіть категорію:");
        System.out.println("1. Курси");
        System.out.println("2. Вчителі");
        System.out.println("3. Студенти");
        System.out.println("4. Лекції");

        checkIntNumber = readInteger();

        return getCheckIntNumber();}

    private static int getCheckIntNumber() {
        while (checkIntNumber < 1 || checkIntNumber > 5) {
            System.out.println("try agan (number must be from 1 to 5)");
            checkIntNumber = readInteger();
        }
        return checkIntNumber;







}}

