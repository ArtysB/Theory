package com.java.baltrukartyom.javacore.chapter07;

public class StaticDemo {
    static int a = 42;
    static int b = 99;
    static void callme(){
        System.out.println("a = " + a);
    }
}
class staticByName{
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}