package ru.develop.dmden.lessons.modul7.io;

import ru.develop.dmden.lessons.modul6.sets.Car;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class IOApp {
    public static void main(String[] args) {
        Set<Car> cars1 = new HashSet<>();
        cars1.add(new Car("Mazda", "Atenza", 50));
        cars1.add(new Car("Audi", "A6", 70));
        cars1.add(new Car("BMW", "X5", 80));
        cars1.add(new Car("Toyota", "Camry", 70));
        cars1.add(new Car("VW", "Passat", 50));
        //-----------------------------------------------------------------
        FileWriter writer = null;

        try {
            writer = new FileWriter("Cars.txt");
            for (Car car : cars1) {
                writer.write("Brand " + car.getBrand() + ", model " + car.getModel() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
