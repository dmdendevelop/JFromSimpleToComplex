package ru.develop.dmden.lessons.modul6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App001 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("yelow");
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("white");
        colors.add("brown");
        colors.add("grey");
        System.out.println("Unsorted: " + colors);

        Collections.sort(colors);
        System.out.println("Sorted: " + colors);
    }
}
