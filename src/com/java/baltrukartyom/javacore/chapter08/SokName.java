package com.java.baltrukartyom.javacore.chapter08;

// Использовать ключевое слово super с целью предотвратить сокрытие имен
public class SokName {
    int i;
}
class B1 extends SokName{
    int i;   // этот член i скрывает член i из класса SokName
    B1(int a, int b){
        super.i = a;  // член i из класса SokName
        i = b;        // член i из класса B1
    }
    void show(){
        System.out.println("i из супер класса: " + super.i);
        System.out.println("i из подкласса: " + i);
    }
}
class UseSuper{
    public static void main(String[] args) {
        B1 subOb = new B1(1,2);
        subOb.show();
    }
}