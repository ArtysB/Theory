package com.java.baltrukartyom.javacore.chapter07;

// Продемонстрировать применение массивов объе ктов типа String
public class StringDemo3 {
    public static void main(String[] args) {
        String[] str = {"Один", "Два", "Три"};

        for (int i = 0; i < str.length; i++){
            System.out.println("str [" + i + "]: " + str[i]);
        }
    }
}
