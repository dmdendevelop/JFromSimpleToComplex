package ru.develop.dmden.lessons.modul4.aircrafts;

public class Engine {
    private EngineType engineType;
    private int power;

    public Engine(EngineType engineType, int power) {
        this.engineType = engineType;
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getPower() {
        return power;
    }
}
