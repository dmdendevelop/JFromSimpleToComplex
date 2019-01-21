package ru.develop.dmden.lessons.modul2.strings;

public class Strings {
    public static void main(String[] args) {
        String string1 = "I like black coffee!!!";
        System.out.println(string1);
        System.out.println(string1.toUpperCase());
        System.out.println(string1.toLowerCase());

        String string2 = string1;
        System.out.println(string1 == string2);
        string2 = new String("I like black coffee!!!");
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));

        System.out.println(string1.endsWith("off"));
        System.out.println(string1.endsWith("offee!!!"));
        System.out.println(string1.length());
    }
}
