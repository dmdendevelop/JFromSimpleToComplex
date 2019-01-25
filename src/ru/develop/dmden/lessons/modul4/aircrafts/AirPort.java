package ru.develop.dmden.lessons.modul4.aircrafts;

public class AirPort {
    private Aircraft aircraft;

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void sendAircraft(Aircraft aircraft) {
        if (aircraft instanceof PassengerAircraft) {
            ((PassengerAircraft) aircraft).boardingOfPass(250);
        }
            aircraft.takeoff();
            aircraft.altUp(10000);
            aircraft.fly(13000);
    }

    public void reciveAircraft(Aircraft aircraft) {
        aircraft.altDown(aircraft.getMinAlt());
        aircraft.landing();
        if (aircraft instanceof PassengerAircraft) {
            ((PassengerAircraft) aircraft).dissOfPass(((PassengerAircraft) aircraft).getCurrentNumOfPass());
        }
    }
}
