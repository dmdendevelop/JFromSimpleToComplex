package ru.develop.dmden.lessons.modul5.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        boolean continueLoop = true;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Please enter numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter denominator: ");
                int denominator = scanner.nextInt();
                System.out.println(divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.nextLine();
                System.out.println("Denominator zero, or non int!!!");
            }
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
