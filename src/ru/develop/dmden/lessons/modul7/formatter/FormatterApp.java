package ru.develop.dmden.lessons.modul7.formatter;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FormatterApp {
    public static void main(String[] args) throws FileNotFoundException {
        Formatter formatter = new Formatter("Cars.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the model, color.");

        for (int i = 0; i < 5; i++) {
            formatter.format("%d - %s, color - %s%n", i, scanner.next(), scanner.next());
        }
        formatter.close();
    }
}
