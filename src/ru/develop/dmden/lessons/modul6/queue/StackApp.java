package ru.develop.dmden.lessons.modul6.queue;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            stack.push("String_" + i);
        }

        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println(stack.empty());

        while (!stack.empty()) {
            System.out.println(stack.pop());
            System.out.println(stack.size());
        }
        System.out.println(stack.empty());
    }
}
