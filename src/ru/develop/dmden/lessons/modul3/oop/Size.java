package ru.develop.dmden.lessons.modul3.oop;

public enum Size {
    VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"), LARGE("L"), VERY_LARGE("XL");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
