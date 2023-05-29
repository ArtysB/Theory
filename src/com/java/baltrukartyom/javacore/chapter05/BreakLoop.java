package com.java.baltrukartyom.javacore.chapter05;

// Применение оператора break для выхода из вложенных циклов
public class BreakLoop {
    public static void main(String[] args) {
        outer:{
        for(int i = 0; i < 3; i++){
            System.out.print("Проход " + i + ":");
            for (int j = 0; j < 100; j++){
                if (j == 10) break outer; //выход из обоих циклов
                    System.out.println(j + " ");

                }
            }
            System.out.println("Эта строка не будет выводиться");
        }
        System.out.println("Циклы завершены");
        }
    }

