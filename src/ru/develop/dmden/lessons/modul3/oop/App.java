package ru.develop.dmden.lessons.modul3.oop;

public class App {
    public static void main(String[] args) {
        Dog lab = new Dog();
//        lab.paws = 4;
//        lab.tail = 1;
//        lab.name = "Dik";
//        lab.breed = "Labrador";

        lab.setPaws(4);
        lab.setTail(1);
        lab.setBreed("Labrador");
        lab.setName("Dick");
        System.out.println("=======================");

        System.out.println("**********************");
        System.out.println(lab.getName());
        System.out.println(lab.getBreed());
        System.out.println(lab.getPaws());
        System.out.println(lab.getTail());
        System.out.println("**********************");

        Dog shepherd = new Dog();
        shepherd.setName("Mike");
        shepherd.setBreed("Shepherd");
        shepherd.setTail(2);
        shepherd.setPaws(5);
        System.out.println("========================");

        System.out.println("**********************");
        System.out.println(shepherd.getName());
        System.out.println(shepherd.getBreed());
        System.out.println(shepherd.getPaws());
        System.out.println(shepherd.getTail());
        System.out.println("**********************");
    }
}
