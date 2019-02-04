package ru.develop.dmden.lessons.modul6.lists;

public class ToDoListApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.printTasks();
        System.out.println("==================");

        toDoList.addToList("qwerty");
        toDoList.addToList("asdfgh");
        toDoList.addToList("zxcvbn");
        toDoList.addToList("qwe");
        toDoList.addToList("asdf");
        toDoList.printTasks();
        System.out.println("==================");

        toDoList.addToPositionList(3, "lkjh");
        toDoList.printTasks();
        System.out.println("==================");

        toDoList.changeTask(2, "1111");
        toDoList.printTasks();
        System.out.println("==================");

        System.out.println(toDoList.getPriority("qwe"));
        System.out.println("==================");

        toDoList.removeTask("qwerty");
        toDoList.printTasks();
        System.out.println("==================");

        toDoList.clearAllTasks();
        toDoList.printTasks();
    }
}
