package ru.develop.dmden.lessons.modul4.aircrafts;

public class App {
    public static void main(String[] args) {
        AirPort airPort = new AirPort();
        Aircraft aircraftPass = new PassengerAircraft(13000, 100, 17000, 2, 300,
                new Engine(EngineType.TURBOFUN, 100000));

        airPort.setAircraft(aircraftPass);
        airPort.sendAircraft(airPort.getAircraft());
        airPort.reciveAircraft(airPort.getAircraft());
    }
}
