package ru.develop.dmden.lessons.modul2.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage("qwer");
        System.out.println("Square of rectangle = " + calcRectSqare(5, 6));
    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    static int calcRectSqare(int a, int b) {
        return a * b;
    }
}
