package ru.develop.dmden.lessons.modul2.controlstatement;

public class WhileDo {
    public static void main(String[] args) {
        int finalBalance = 100000;
        double currentBalance = 0;
        int payment = 10000;
        int years = 0;
        double interestRate = 0.1;

        while (currentBalance < finalBalance) {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBalance);
        }

        System.out.println("***********************************************");

        do {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBalance);
        } while (currentBalance < finalBalance);
    }
}
