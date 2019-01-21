package ru.develop.dmden.lessons.modul3.oop;

public class App {
    public static void main(String[] args) {
        Dog lab = new Dog();
        lab.setBreed("Labrador");
        lab.setName("Dick");
        lab.setSize(Size.AVERAGE);
        System.out.println("=======================");
        lab.bark();
        lab.bite();

        Dog shepherd = new Dog();
        shepherd.setName("Mike");
        shepherd.setBreed("Shepherd");
        shepherd.setSize(Size.LARGE);
        System.out.println("========================");
        shepherd.bark();
        shepherd.bite();

        Dog poodle = new Dog();
        poodle.setBreed("Poodle");
        poodle.setName("Jack");
        poodle.setSize(Size.SMALL);
        System.out.println("========================");
        poodle.bark();
        poodle.bite();
    }
}
