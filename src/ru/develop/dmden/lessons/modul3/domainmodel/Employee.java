package ru.develop.dmden.lessons.modul3.domainmodel;

public class Employee {
    private static int count;
    private int id;
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        count++;
        id = count;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
