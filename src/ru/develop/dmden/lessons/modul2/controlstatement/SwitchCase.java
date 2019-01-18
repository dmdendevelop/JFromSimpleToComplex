package ru.develop.dmden.lessons.modul2.controlstatement;

public class SwitchCase {
    public static void main(String[] args) {
        int choice = 6;
        switch (choice) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default");
        }
        System.out.println("final string");
    }
}
