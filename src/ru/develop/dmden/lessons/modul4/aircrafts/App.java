package ru.develop.dmden.lessons.modul4.aircrafts;

public class App {
    public static void main(String[] args) {
        Aircraft aircraft1 = new Aircraft(100, 2, 5000, EngineType.ELECTRIC,
                "qwe", "asd");
        PassengerAircraft passengerAircraft = new PassengerAircraft(11000, 500, 15000,
                EngineType.TURBOFUN, "Airbus", "A-350", 300);

        aircraft1.toTakeoff(500);
        passengerAircraft.toTakeoff(10000);
    }
}
