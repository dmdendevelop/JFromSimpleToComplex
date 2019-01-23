package ru.develop.dmden.lessons.modul4;

public class ElectricCar extends Auto {
    private int baterryVolume;
    private int passengersNumber;

    public ElectricCar(String producer, String model, int baterryVolume, int passengersNumber) {
        super(producer, model, EngineType.ELECTRIC);
        this.baterryVolume = baterryVolume;
        this.passengersNumber = passengersNumber;
        System.out.println("ElectricCar is init");
    }

    public void toCharge() {
        System.out.println("Baterry is charging");
    }

    public int getBaterryVolume() {
        return baterryVolume;
    }

    public void setBaterryVolume(int baterryVolume) {
        this.baterryVolume = baterryVolume;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
