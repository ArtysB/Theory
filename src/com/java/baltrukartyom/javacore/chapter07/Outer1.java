package com.java.baltrukartyom.javacore.chapter07;

// Определить внутренний класс в цикле for
public class Outer1 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++){
            class Inner {
                void display() {
                    System.out.println("outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
    }
    }
}
class InnerDemo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}