package com.java.baltrukartyom.javacore.chapter03;

// символьные переменные ведут себя как целочисленные значения
public class CharDemo2 {
    public static void main(String[] args) {
        char ch1;
        ch1 = 'X';
        System.out.println("ch1 содержит " + ch1);
        ch1++; // увеличиваем значение переменной на единицу
        System.out.println("ch1 теперь содержит " + ch1);
    }
}
