package ru.develop.dmden.lessons.modul4;

public class FuelAuto extends Auto {
    private int availableFuel;
    private int tankVolume;

    public FuelAuto(String producer, String model, EngineType engineType, int availableFuel, int tankVolume) {
        super(producer, model, engineType);
        this.availableFuel = availableFuel;
        this.tankVolume = tankVolume;
        System.out.println("FuelAuto is init");
    }

    public void fuelUp(int fuelVolium) {
        availableFuel+=fuelVolium;
        System.out.println("Available fuel = " + fuelVolium);
    }

    public int getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(int availableFuel) {
        this.availableFuel = availableFuel;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
