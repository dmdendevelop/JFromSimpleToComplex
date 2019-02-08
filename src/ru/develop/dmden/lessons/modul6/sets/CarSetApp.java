package ru.develop.dmden.lessons.modul6.sets;

import java.util.HashSet;
import java.util.Set;

public class CarSetApp {
    public static void main(String[] args) {
        Set<Car> cars1 = new HashSet<>();
        Set<Car> cars2 = new HashSet<>();
        //----------------------------------------------------------------
        cars1.add(new Car("Mazda", "Atenza", 50));
        cars1.add(new Car("Audi", "A6", 70));
        cars1.add(new Car("BMW", "X5", 80));
        cars1.add(new Car("Toyota", "Camry", 70));
        cars1.add(new Car("VW", "Passat", 50));
        //----------------------------------------------------------------
        cars2.add(new Car("Mersedes", "E430", 100));
        cars2.add(new Car("Nissan", "GTR", 150));
        cars2.add(new Car("Mazda", "Atenza", 50));
        cars2.add(new Car("Reno", "Coleos", 60));
        cars2.add(new Car("Subaru", "Forester", 50));
        //------------------------------------------------------------------
        print(cars1);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        print(cars2);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        //-------------------------------------------------------------------------------------
        Set<Car> uniqCars = new HashSet<>(cars1);
        uniqCars.addAll(cars2);
        print(uniqCars);

    }

    public static void print(Set<Car> cars) {
        System.out.printf("%-20s %-20s %-20s \n", "Brand", "Model", "Price per day");
        for (Car car : cars) {
            System.out.printf("%-20s %-20s %-20s \n", car.getBrand(), car.getModel(), car.getPricePerday());
        }
    }
}
