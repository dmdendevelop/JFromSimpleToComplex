package ru.develop.dmden.lessons.modul6.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ToDoLinkedList {
    private LinkedList<String> toDoLinkedList = new LinkedList<>();

    public void addToList(String task) {
        toDoLinkedList.add(task);
    }

    public void addFirstToList(String task) {
        toDoLinkedList.addFirst(task);
    }

    public void addToPositionList(int position, String task) {
        toDoLinkedList.add(position, task);
    }

    public void changeTask(int position, String task) {
        toDoLinkedList.set(position, task);
    }

    public void removeTask(String task) {
        toDoLinkedList.remove(task);
    }

    public int getPriority(String task) {
        return toDoLinkedList.indexOf(task);
    }

    public void clearAllTasks() {
        toDoLinkedList.clear();
    }

    public void printTasks() {
        if (toDoLinkedList.size() == 0) {
            System.out.println("((((((((((");
            return;
        }
//        for (int i = 0; i < toDoLinkedList.size(); i++) {
//            System.out.println("Pry-" + i + ": task-" + toDoLinkedList.get(i));
//        }
        Iterator<String> iterator = toDoLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element " + " - " + iterator.next());
        }
    }

    public boolean alphabetOrder(String task) {
        ListIterator<String> listIterator = toDoLinkedList.listIterator();
        while (listIterator.hasNext()) {
            int compared = listIterator.next().compareToIgnoreCase(task);
            if (compared == 0) {
                System.out.println("Already exist!!!");
                return true;
            } else if (compared > 0) {
                listIterator.previous();
                listIterator.add(task);
                return true;
            }
        }

        toDoLinkedList.add(task);
        return true;
    }
}
