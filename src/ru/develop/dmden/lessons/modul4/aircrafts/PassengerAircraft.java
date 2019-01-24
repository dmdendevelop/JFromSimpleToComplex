package ru.develop.dmden.lessons.modul4.aircrafts;

public class PassengerAircraft extends Aircraft {
    private int passengersNumber;

    public PassengerAircraft(double maxAltitude, double minAltitude, double maxRange, EngineType engineType,
                             String producer, String model, int passengersNumber) {
        super(maxAltitude, minAltitude, maxRange, engineType, producer, model);
        this.passengersNumber = passengersNumber;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    @Override
    public void toTakeoff(double altitude) {
        if (isFly()) {
            System.out.println("Passenger aircraft already flying");
            return;
        } else if (altitude < getMinAltitude()) {
            System.out.println("The specified height below the minimum");
            setCurrentAltitude(getMinAltitude());
        } else if (altitude > getMaxAltitude()) {
            System.out.println("The specified height greater than the maximum");
            setCurrentAltitude(getMaxAltitude());
        } else {
            setCurrentAltitude(altitude);
        }
        setFly(true);
        System.out.println("The passenger aircraft gained altitude " + getCurrentAltitude());
    }

    @Override
    public void toLanding() {
        super.toLanding();
    }

    @Override
    public void altitudeUP(double altitude) {
        super.altitudeUP(altitude);
    }

    @Override
    public void altitudeDown(double altitude) {
        super.altitudeDown(altitude);
    }

    @Override
    public void toFly(double range) {
        super.toFly(range);
    }
}
