package ru.develop.dmden.lessons.modul3.constructors;

import ru.develop.dmden.lessons.modul3.domainmodel.Employee;

public class ConstructorsMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Dmitriy", "Developer", 100);
        Employee employee2 = new Employee("Alexey", "Engineer", 100);
        Employee employee3 = new Employee("Anatoliy", "Chief", 120);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
