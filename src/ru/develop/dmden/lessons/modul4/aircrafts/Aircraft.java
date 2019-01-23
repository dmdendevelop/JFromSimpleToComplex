package ru.develop.dmden.lessons.modul4.aircrafts;

public class Aircraft {
    private double maxAltitude;
    private double minAltitude;
    private double currentAltitude;
    private double maxRange;
    private double currentRange;
    private EngineType engineType;
    private boolean isFly;
    private String producer;
    private String model;

    public Aircraft(double maxAltitude, double minAltitude, double maxRange, EngineType engineType, String producer, String model) {
        this.maxAltitude = maxAltitude;
        this.minAltitude = minAltitude;
        this.maxRange = maxRange;
        this.engineType = engineType;
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCurrentRange() {
        return currentRange;
    }

    public void setCurrentRange(double currentRange) {
        this.currentRange = currentRange;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public double getCurrentAltitude() {
        return currentAltitude;
    }

    public void setCurrentAltitude(double currentAltitude) {
        this.currentAltitude = currentAltitude;
    }

    public double getMinAltitude() {
        return minAltitude;
    }

    public void setMinAltitude(double minAltitude) {
        this.minAltitude = minAltitude;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public double getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(double maxRange) {
        this.maxRange = maxRange;
    }

    public void toTakeoff(double altitude) {
        if (isFly) {
            System.out.println("Aircraft already flying");
            return;
        } else if (altitude < minAltitude) {
            System.out.println("The specified height below the minimum");
            currentAltitude = minAltitude;
        } else if (altitude > maxAltitude) {
            System.out.println("The specified height greater than the maximum");
            currentAltitude = maxAltitude;
        } else {
            currentAltitude = altitude;
        }
        isFly = true;
        System.out.println("The aircraft gained altitude " + currentAltitude);
    }

    public void toLanding() {
        if (!isFly) {
            System.out.println("The aircraft is already on the ground");
            return;
        }
        currentAltitude = 0;
        isFly = false;
        System.out.println("The aircraft landed");
    }

    public void altitudeUP(double altitude) {
        if (!isFly) {
            System.out.println("The aircraft on the ground");
            return;
        } else if (!(currentAltitude < maxAltitude)) {
            System.out.println("The altitude is maximum");
            return;
        } else if (!(altitude <= maxAltitude)) {
            System.out.println("The specified height is greater than the maximum");
            currentAltitude = maxAltitude;
        } else {
            currentAltitude=altitude;
        }
        System.out.println("Altitude Up to " + currentAltitude);
    }

    public void altitudeDown(double altitude) {
        if (!isFly) {
            System.out.println("The aircraft on the ground");
            return;
        } else if (!(currentAltitude > minAltitude)) {
            System.out.println("The altitude is minimum");
            return;
        } else if (!(altitude >= minAltitude)) {
            System.out.println("The specified height is below than the minimum");
            currentAltitude = minAltitude;
        } else {
            currentAltitude=altitude;
        }
        System.out.println("Altitude Down to " + currentAltitude);
    }

    public void toFly(double range) {
        if (!isFly) {
            System.out.println("The aircraft on the ground");
            return;
        } else if (range > maxRange) {
            System.out.println("The specified range is greater than the maximum");
            return;
        }
        currentRange = range;
        System.out.println("The aircraft flew to a range of " + currentRange);
    }
}
