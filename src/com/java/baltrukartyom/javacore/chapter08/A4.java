package com.java.baltrukartyom.javacore.chapter08;

// Методы с отличающимися сигнатурами считаются
// перегружаемыми, а не переопределяемыми
public class A4 {
    int i, j;

    A4(int a, int b) {
        i = a;
        j = b;
    }
    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
// создать подкласс путем расширения класса А
class B4 extends A4{
    int k;
    B4(int a,int b, int c){
        super(a,b);
        k = c;
    }
    // перегрузить метод show ()
    void show(String msg){
        System.out.println(msg + k);
    }
}
class Override2{
    public static void main(String[] args) {
        B4 subOb = new B4(1,2,3);
        subOb.show("Это k: "); // вызвать метод show() из класса В4
        subOb.show();               // вызвать метод show() из класса A4
    }
}