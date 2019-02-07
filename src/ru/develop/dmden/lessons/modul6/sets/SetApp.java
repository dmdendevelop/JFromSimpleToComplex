package ru.develop.dmden.lessons.modul6.sets;

import java.util.*;

public class SetApp {
    public static void main(String[] args) {
        String[] cars1 = {"Mazda", "BMW", "Audi", "Ferrari", "Range Rover", "Nissan"};
        String[] cars2 = {"Toyota", "BMW", "Porshe", "Lamborgini", "Land Rover", "Audi"};

        System.out.println(Arrays.toString(cars1));
        System.out.println(Arrays.toString(cars2));
        System.out.println("###################################################################");

        Set<String> carsSet1 = new HashSet<>(Arrays.asList(cars1));
        Set<String> carsSet2 = new HashSet<>(Arrays.asList(cars2));
        System.out.println(carsSet1);
        System.out.println(carsSet2);
        System.out.println("###################################################################");

        Set<String> linkedCarsSet1 = new LinkedHashSet<>(Arrays.asList(cars1));
        Set<String> linkedCarsSet2 = new LinkedHashSet<>(Arrays.asList(cars2));
        System.out.println(linkedCarsSet1);
        System.out.println(linkedCarsSet2);
        System.out.println("###################################################################");

        Set<String> treeCarsSet1 = new TreeSet<>(Arrays.asList(cars1));
        Set<String> treeCarsSet2 = new TreeSet<>(Arrays.asList(cars2));
        System.out.println(treeCarsSet1);
        System.out.println(treeCarsSet2);
        System.out.println("###################################################################");

        Set<String> set = new TreeSet<>(carsSet1);
        set.addAll(carsSet2);
        System.out.println(set);
    }
}
