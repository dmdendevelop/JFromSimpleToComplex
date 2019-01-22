package ru.develop.dmden.lessons.modul4;

public class App {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Kia", "GranBird", EngineType.DIESEL);
        System.out.println(bus1);
        bus1.toStart();
        bus1.toAccelerate(60);
        bus1.toStop();
    }
}
