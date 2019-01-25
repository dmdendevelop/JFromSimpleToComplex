package ru.develop.dmden.lessons.modul4.aircrafts;

public interface Flyable {
    void altUp(double alt);

    void altDown(double alt);

    void fly(double range);

    void takeoff();

    void landing();
}
