package ru.develop.dmden.lessons.modul4.aircrafts;

public class PassengerAircraft extends Aircraft {
    private int numberOfEngines;
    private Engine engine;
    private int maxNumberOfPass;
    private int currentNumOfPass;

    public PassengerAircraft(double maxAlt, double minAlt, double maxRange, int numberOfEngines, int maxNumberOfPass,
                             Engine engine) {
        super(maxAlt, minAlt, maxRange);
        this.numberOfEngines = numberOfEngines;
        this.maxNumberOfPass = maxNumberOfPass;
        this.engine = engine;
    }

    public int getCurrentNumOfPass() {
        return currentNumOfPass;
    }

    public void setCurrentNumOfPass(int currentNumOfPass) {
        this.currentNumOfPass = currentNumOfPass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMaxNumberOfPass() {
        return maxNumberOfPass;
    }

    public void setMaxNumberOfPass(int maxNumberOfPass) {
        this.maxNumberOfPass = maxNumberOfPass;
    }

    public void boardingOfPass(int numberOfPass) {
        if (!isFly()) {
            if (getMaxNumberOfPass() >= numberOfPass) {
                setCurrentNumOfPass(numberOfPass);
            } else {
                setCurrentNumOfPass(getMaxNumberOfPass());
            }
            System.out.println("The doors are closed. On Board " + getCurrentNumOfPass() + " passengers");
        } else {
            System.out.println("The plane in the air. Passengers cannot Board");
        }
    }

    public void dissOfPass(int numberOfPass) {
        if (!isFly()) {
            setCurrentNumOfPass(getCurrentNumOfPass() - numberOfPass);
            System.out.println("Disembarkation of passengers is complete");
            if (getCurrentNumOfPass() > 0) {
                System.out.println("On Board " + getCurrentNumOfPass() + " passengers.");
            } else {
                System.out.println("All passengers have left the Board");
            }
        } else {
            System.out.println("The plane in the air. Passenger disembarkation is not possible");
        }
    }
}
