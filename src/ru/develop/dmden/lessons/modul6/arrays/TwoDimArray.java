package ru.develop.dmden.lessons.modul6.arrays;

import java.security.SecureRandom;

public class TwoDimArray {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int[][] mulArray = new int[random.nextInt(9) + 1][];

        for (int i = 0; i < mulArray.length; i++) {
            mulArray[i] = new int[random.nextInt(10)];
        }

        for (int i = 0; i < mulArray.length; i++) {
            for (int j = 0; j < mulArray[i].length; j++) {
                mulArray[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < mulArray.length; i++) {
            for (int j = 0; j < mulArray[i].length; j++) {
                System.out.print(mulArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
