package ru.develop.dmden.lessons.modul3.oop;

public class Dog {
    public static int dogsCounter;

    private int paws;
    private int tail;
    private String name;
    private String breed;
    private String size;

    public Dog() {
        dogsCounter++;
        System.out.println("Dogscounter = " + dogsCounter);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Small") ||
                size.equalsIgnoreCase("average") ||
                size.equalsIgnoreCase("large")) {
            this.size = size;
        } else {
            System.out.println("Wrong size!!!");
        }
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

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("Should be four paws");
        }
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("Should be one tail");
        }
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
        if (size.equalsIgnoreCase("Large")) {
            System.out.println("Wuf - wuf");
        } else if (size.equalsIgnoreCase("average")) {
            System.out.println("Raw - raw");
        } else if (size.equalsIgnoreCase("small")) {
            System.out.println("Tyaf - tyaf");
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
