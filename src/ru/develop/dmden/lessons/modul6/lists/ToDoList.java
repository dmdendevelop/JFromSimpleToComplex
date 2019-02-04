package ru.develop.dmden.lessons.modul6.lists;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> toDoList = new ArrayList<>();

    public void addToList(String task) {
        toDoList.add(task);
    }

    public void addToPositionList(int position, String task) {
        toDoList.add(position, task);
    }

    public void changeTask(int position, String task) {
        toDoList.set(position, task);
    }

    public void removeTask(String task) {
        toDoList.remove(task);
    }

    public int getPriority(String task) {
        return toDoList.indexOf(task);
    }

    public void clearAllTasks() {
        toDoList.clear();
    }

    public void printTasks() {
        if (toDoList.size() == 0) {
            System.out.println("((((((((((");
            return;
        }
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Pry-" + i + ": task-" + toDoList.get(i));
        }
    }
}
