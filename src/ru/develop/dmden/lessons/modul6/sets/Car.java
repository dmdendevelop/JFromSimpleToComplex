package ru.develop.dmden.lessons.modul6.sets;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final Integer pricePerday;

    public Car(String brand, String model, int pricePerday) {
        this.brand = brand;
        this.model = model;
        this.pricePerday = pricePerday;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPricePerday() {
        return pricePerday;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        if (!this.brand.equals(((Car) obj).getBrand())) {
            return false;
        }
        if (!this.model.equals(((Car) obj).getModel())) {
            return false;
        }
        return  (this.pricePerday.equals(((Car) obj).getPricePerday()));
    }

    @Override
    public int hashCode() {

        //===============================================
        return Objects.hash(brand, model, pricePerday);
    }
}
