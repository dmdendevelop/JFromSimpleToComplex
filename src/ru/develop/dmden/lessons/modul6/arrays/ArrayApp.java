package ru.develop.dmden.lessons.modul6.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mayArray = new int[5];

        for (int i = 0; i < mayArray.length; i++) {
            System.out.println("Enter the next integer element:");
            mayArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < mayArray.length; i++) {
            System.out.println("myArray #" + i + " = " + mayArray[i]);
        }
        System.out.println("=============================================");
        int[] newArray = Arrays.copyOf(mayArray, mayArray.length);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("newArray #" + i + " = " + newArray[i]);
        }

        Arrays.sort(newArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("newArray #" + i + " = " + newArray[i]);
        }
    }
}
