package ru.develop.dmden.lessons.modul3.domainmodel;

public class Employee {
    private static int count;
    private int id;
    private String name;
    private String position;
    private int salary;
    private String department;

    {
        name = "No_name";
        position = "No_position";
        salary = 0;
        department = "No_department";
    }

    public Employee() {
        id = ++count;
    }

    public Employee(String name) {
        this(name, "Developer", 100);
    }

    public Employee(String name, String position, int salary) {
        this(name, position, salary, "IT");
    }

    public Employee(String name, String position, int salary, String department) {
        id = ++count;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
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
                ", department='" + department + '\'' +
                '}';
    }
}
