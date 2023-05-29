package com.java.baltrukartyom.javacore.chapter08;

// демонстрация порядка вызова конструкторов
public class A2 {
    A2(){
        System.out.println("В конструкторе A2");
    }
}
class B2 extends A2 {
    B2(){
        System.out.println("В конструкторе B2");
    }
}
class C2 extends B2{
    C2(){
        System.out.println("В конструкторе C2");
    }
}
class CallingCons{
    public static void main(String[] args) {
        C2 c2 = new C2();

    }
}