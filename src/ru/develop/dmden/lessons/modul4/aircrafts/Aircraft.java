package ru.develop.dmden.lessons.modul4.aircrafts;

public abstract class Aircraft implements Flyable {
    private double maxAlt;
    private double minAlt;
    private double maxRange;
    private double currentAlt;
    private double currentRange;
    private boolean isFly;

    public Aircraft(double maxAlt, double minAlt, double maxRange) {
        this.maxAlt = maxAlt;
        this.minAlt = minAlt;
        this.maxRange = maxRange;
    }

    public double getMaxAlt() {
        return maxAlt;
    }

    public void setMaxAlt(double maxAlt) {
        this.maxAlt = maxAlt;
    }

    public double getMinAlt() {
        return minAlt;
    }

    public void setMinAlt(double minAlt) {
        this.minAlt = minAlt;
    }

    public double getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(double maxRange) {
        this.maxRange = maxRange;
    }

    public double getCurrentAlt() {
        return currentAlt;
    }

    public void setCurrentAlt(double currentAlt) {
        this.currentAlt = currentAlt;
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

    @Override
    public void takeoff() {
        if (!isFly()) {
            setCurrentAlt(getMinAlt());
            System.out.println("Takeoff complite.");
            setFly(true);
        } else {
            System.out.println("The plane is already in the air!");
        }
    }

    @Override
    public void altUp(double specAlt) {
        if (isFly()) {
            if ((specAlt > getCurrentAlt()) && (specAlt <= getMaxAlt())) {
                setCurrentAlt(specAlt);
                System.out.println("Climb to " + getCurrentAlt());
            } else {
                System.out.println("The plane is still on the ground");
            }
        }
    }

    @Override
    public void fly(double specRange) {
        if (isFly()) {
            if (specRange <= getMaxRange()) {
                setCurrentRange(specRange);
                System.out.println("Range " + getCurrentRange() + "reached.");
            } else {
                System.out.println("The plane is still on the ground");
            }
        }
    }

    @Override
    public void altDown(double specAlt) {
        if (isFly()) {
            if ((specAlt < getCurrentAlt()) && (specAlt >= getMinAlt())) {
                setCurrentAlt(specAlt);
                System.out.println("Down to " + getCurrentAlt());
            } else {
                System.out.println("The plane is still on the ground");
            }
        }
    }

    @Override
    public void landing() {
        if (isFly()) {
            if (getCurrentAlt() == getMinAlt()) {
                setCurrentAlt(0);
                setFly(false);
                System.out.println("Landed.");
            } else {
                System.out.println("Too high");
            }
        } else {
            System.out.println("The plane is already in the ground!");
        }
    }
}
