package ru.develop.dmden.lessons.modul6;

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
    }
}
