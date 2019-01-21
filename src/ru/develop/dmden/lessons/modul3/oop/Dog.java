package ru.develop.dmden.lessons.modul3.oop;

public class Dog {
    public static int dogsCounter;

    public static final int paws = 4;
    public static final int tail = 1;
    private String name;
    private String breed;
    private Size size;

    public Dog() {
        dogsCounter++;
        System.out.println("Dogscounter = " + dogsCounter);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public static int getDogsCounter() {
        return dogsCounter;
    }

    public static void setDogsCounter(int dogsCounter) {
        Dog.dogsCounter = dogsCounter;
    }

    public int getPaws() {
        return paws;
    }

    public int getTail() {
        return tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        switch (size) {
            case VERY_SMALL:
            case SMALL:
                System.out.println("Tyaf - tyaf");
                break;
            case AVERAGE:
                System.out.println("Raw - raw");
                break;
            case LARGE:
            case VERY_LARGE:
                System.out.println("Wuf - wuf");
                break;
        }
    }

    public void bite() {
        if (dogsCounter > 2) {
            System.out.println("Dogs bite!!!");
        } else {
            bark();
        }
    }
}
