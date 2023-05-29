package com.java.baltrukartyom.javacore.chapter03;
/*
Вычислить расстояние, проходимое светом, используя переменные типа long
 */
public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightSpeed = 186000;
        days = 1000; // кол-во дней
        seconds = days * 24 * 60 * 60; // преобразовать в секунды
        distance = lightSpeed * seconds; // вычисляем расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
