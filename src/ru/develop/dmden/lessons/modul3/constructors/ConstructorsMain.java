package ru.develop.dmden.lessons.modul3.constructors;

import ru.develop.dmden.lessons.modul3.domainmodel.Employee;

public class ConstructorsMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Dmitriy", "Developer", 100);
        Employee employee2 = new Employee("Alexey", "Engineer", 100, "Service");
        Employee employee3 = new Employee("Anatoliy", "Chief", 120, "Service");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        Employee employee4 = new Employee();
        Employee employee5 = new Employee("qwer");
        Employee employee6 = new Employee("asdf", "zxcv", -111, "йцук");

        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);
    }
}
