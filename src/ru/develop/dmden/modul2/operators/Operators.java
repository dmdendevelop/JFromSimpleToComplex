package ru.develop.dmden.modul2.operators;

public class Operators {
    public static void main(String[] args) {
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;
        double i = a * b;
        double f = a / b;
        double g = a % b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

//        a = a + 5;
//        a += 5;
        a++;
        System.out.println("New a = " + a);

        b--;
        System.out.println("New b = " + b);

        double n = 7;
        double m = 7;

        double res1 = 2 * n++;
        double res2 = 2 * ++m;
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

        int x = 3;
        int y = 5;
        int z = 8;

        boolean val = y != z;
        System.out.println("val = " + val);

        int res = x < y ? x : y;
        System.out.println("Ternary res = " + y);
    }
}
