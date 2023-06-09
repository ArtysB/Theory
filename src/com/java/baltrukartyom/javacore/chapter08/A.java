package com.java.baltrukartyom.javacore.chapter08;

// простой пример наследования
// создать супер класс
public class A {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i +" "+ j);
    }
}

// создать подкласс путем расширения класса А
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k " + (i + j + k));
    }
}
class SimpleInheritance{
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // суперкласс может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        /*
        Подкласс имеет доступ ко всем открытым членам
        своего суперкласса
         */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Сумма i,j,k в объекте subOb: ");
        subOb.sum();
    }
}