package ru.develop.dmden.lessons.modul6.arrays;

import java.security.SecureRandom;

public class Dies {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i++) {
            ++frequency[secureRandom.nextInt(6) + 1];
        }

        for (int i = 1; i < frequency.length; i++) {
            System.out.println("Side " + i + " : " + frequency[i]);
        }
    }
}
