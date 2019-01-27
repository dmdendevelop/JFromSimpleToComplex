package ru.develop.dmden.lessons.modul4;

import ru.develop.dmden.lessons.modul4.aircrafts.Flyable;

class Nested {
    static private int pr;
    String s = "Member of Nested";

    static class A {
        private int a = pr;
        String s = "Member of A";

        static class AB {
            private int ab = pr;
            String s = "Member of AB";
        }
    }

    class B {
        private int b = pr;
        String s = "Member of B";

        class BC {
            private int bc = pr;
            String s = "Member of BC";
        }

        void f(final int i) {
            final int j = 99;

            class D {
                private int d = pr;
                String s = "Member of D";

                void pr() {
                    System.out.println("pr");
                }
            }
        }
    }

    void m() {
       Flyable flyable = new Flyable(){
            @Override
            public void altUp(double alt) {
                System.out.println(2);
            }

            @Override
            public void altDown(double alt) {
                System.out.println(4);
            }

            @Override
            public void fly(double range) {
                System.out.println(3);
            }

            @Override
            public void takeoff() {
                System.out.println(1);
            }

            @Override
            public void landing() {
                System.out.println(5);
            }
        };
       flyable.takeoff();
       flyable.altUp(2);
       flyable.fly(3);
       flyable.altDown(4);
       flyable.landing();
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.m();
    }
}
