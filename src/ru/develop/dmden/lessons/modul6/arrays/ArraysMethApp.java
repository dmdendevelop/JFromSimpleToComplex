package ru.develop.dmden.lessons.modul6.arrays;

import java.security.SecureRandom;
import java.util.Arrays;

public class ArraysMethApp {
    static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        int[][] firstArray = new int[5][5];

        init(firstArray);
        show(firstArray);
        System.out.println("=================================");
        sumAndAverage(firstArray);
        System.out.println("=================================");
        System.out.println(Arrays.deepToString(firstArray));
        System.out.println("=================================");
        miValue(firstArray);
    }

    public static void init(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public static void show(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void sumAndAverage(int[][] vals) {
        int sum = 0;
        int num = 0;
        for (int[] val : vals) {
            for (int i : val) {
                sum += i;
                num++;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + ((double) sum / num));
    }

    public static void miValue(int[][] array) {
        int min = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        System.out.println("min = " + min);
    }
}
