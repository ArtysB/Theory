package com.java.baltrukartyom.javacore.chapter08;

// Динамическая диспетчеризация методов
public class A5 {
    void callme(){
        System.out.println("В методе callme из класса A");
    }
}
class B5 extends A5{
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme из класса B");
    }
}
class C5 extends A5{
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme из класса C");
    }
}
class Dispatch{
    public static void main(String[] args) {
        A5 a = new A5();     // объект класса А
        B5 b = new B5();    // объект класса B
        C5 c = new C5();   // объект класса C
        A5 r;               // получить ссылку на объект типа А
        r = a;
        r.callme();      //переменная r ссылается на объект типа A вызвать метод callme определенный в классе A

        r = b;
        r.callme();      //переменная r ссылается на объект типа A вызвать метод callme определенный в классе B

        r = c;
        r.callme();      //переменная r ссылается на объект типа A вызвать метод callme определенный в классе C
    }
}