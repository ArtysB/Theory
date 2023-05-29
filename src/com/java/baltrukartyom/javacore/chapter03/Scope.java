package com.java.baltrukartyom.javacore.chapter03;

// демонстрация области действия кода
public class Scope {
    public static void main(String[] args) {
        int x; //эта переменная доступна всему коду из метода main()
        x = 10;
        if (x == 10) {    // начало новой области действия, доступной только этому блоку кода
            int y = 20;   // обе переменные x и y доступны в этой области действия
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // ОШИБКА! переменная у недоступна в этой области действия,
        // тогда как переменная х доступна и здесь
        System.out.println("x = " + x);
    }
}
