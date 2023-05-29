package com.java.baltrukartyom.javacore.chapter03;

// вычислить площадь круга
public class Area {
    public static void main(String[] args) {
        double pi,r,a;
        r = 10.8; // инициализируем радиус окружности
        pi = 3.1416; // приблизительное число Пи
        a = pi * r * r; // вычисляем площать круга

        System.out.println("Площадь круга равна " + a);
    }
}
