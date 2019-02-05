package ru.develop.dmden.lessons.modul6.lists;

public class ToDoLinkedListApp {
    public static void main(String[] args) {
        ToDoLinkedList toDoLinkedList = new ToDoLinkedList();


        System.out.println("====================");

        toDoLinkedList.alphabetOrder("qwe");
        toDoLinkedList.alphabetOrder("dfg");
        toDoLinkedList.alphabetOrder("t1");
        toDoLinkedList.alphabetOrder("t3");
        toDoLinkedList.alphabetOrder("t2");
        toDoLinkedList.alphabetOrder("asdf");
        toDoLinkedList.alphabetOrder("543");
        toDoLinkedList.alphabetOrder("123");
        toDoLinkedList.alphabetOrder("1");
        toDoLinkedList.alphabetOrder("2");
        toDoLinkedList.alphabetOrder("b");
        toDoLinkedList.alphabetOrder("a");
        toDoLinkedList.alphabetOrder("000");
        toDoLinkedList.printTasks();
    }
}
