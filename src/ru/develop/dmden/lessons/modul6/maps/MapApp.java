package ru.develop.dmden.lessons.modul6.maps;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("qwer", 2);
        System.out.println(numbers.put("qwer", 1));
        System.out.println(numbers.put("qwer", 3));
        numbers.put("qwer", 1);
        numbers.put("asdf", 2);
        numbers.put("zxcv", 3);
        numbers.put("йцук", 4);
        numbers.put("фыва", 5);

        System.out.println(numbers);
    }
}
