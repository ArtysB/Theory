package com.java.baltrukartyom.javacore.chapter08;

// Простой пример абстракции
abstract class A6 {
    abstract void callme();
    void callmetoo(){
        System.out.println("Это конкретный метод");
    }
}
class B6 extends A6{
    void callme(){
        System.out.println("Реализация метода callme() из класса B");
    }
}
class AbstractDemo{
    public static void main(String[] args) {
        B6 b = new B6();
        b.callme();
        b.callmetoo();
    }
}