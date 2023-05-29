package com.java.baltrukartyom.javacore.chapter02;
/*
Еще один короткий пример программы.
Присвоить исходному файлу имя Example2.java
 */
public class Example2 {
    public static void main(String[] args) {
        int num;   // в этой строке кода объявляется переменная с именем num
        num = 100; // переменной num присваивается значение 100
        System.out.println("Это переменная num:" + num); // вывод в консоль
        num = num * 2;
        System.out.print("Значение переменной num * 2 равно: ");
        System.out.println(num);
    }
}
