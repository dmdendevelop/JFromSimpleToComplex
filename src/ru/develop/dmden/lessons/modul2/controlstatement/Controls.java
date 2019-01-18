package ru.develop.dmden.lessons.modul2.controlstatement;

public class Controls {
    public static void main(String[] args) {
        int i = 10;

        {
            int k = 15;
            System.out.println("k = " + k);
            System.out.println("i = " + i);
        }

        System.out.println("i = " + i);
//        System.out.println("k = " + k);

        int testScore = 95;
        System.out.println("You've got");
        if (testScore >= 90) {
            System.out.println("an excellent");
        } else if (testScore >= 75) {
            System.out.println("a good");
        } else if (testScore >= 60) {
            System.out.println("a satisfactory");
        } else {
            System.out.println("bad");
        }
        System.out.println("mark");
    }
}
