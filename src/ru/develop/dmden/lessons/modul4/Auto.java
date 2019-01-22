package ru.develop.dmden.lessons.modul4;

public class Auto {
    private String producer;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    private boolean isRunning;

    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Auto is init.");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                '}';
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void toStart() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Start. CurrentSpeed = " + currentSpeed);
    }

    public void toStop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Stop. CurrentSpeed = " + currentSpeed);
    }

    public void toAccelerate(int speed) {
        currentSpeed += speed;
        System.out.println("Accelerated. CurrentSpeed = " + currentSpeed);
    }
}
