package ru.develop.dmden.lessons.modul6.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PryQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        System.out.println(queue.isEmpty());
        for (int i = 0; i < 10; i++) {
            queue.add("String_" + i);
        }
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        for (String s : queue) {
            System.out.println(s);
        }

        queue.add("g");
        queue.add("d");
        queue.add("a");
        queue.add("7");
        queue.add("3");
        queue.add("0");
        queue.add("F");
        queue.add("D");
        queue.add("A");
        String[] strings = queue.toArray(new String[0]);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(queue.size());
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
