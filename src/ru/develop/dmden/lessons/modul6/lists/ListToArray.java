package ru.develop.dmden.lessons.modul6.lists;

import java.util.Arrays;
import java.util.LinkedList;

public class ListToArray {
    public static void main(String[] args) {
        String[] colors = {"yellow", "green", "blue"};
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("***********************************");

        LinkedList<String> colorsList = new LinkedList(Arrays.asList(colors));
        colorsList.add("Black");
        for (String s : colorsList) {
            System.out.println(s);
        }
        System.out.println("***********************************");

        colors = colorsList.toArray(new String[colorsList.size()]);
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("***********************************");
    }
}
