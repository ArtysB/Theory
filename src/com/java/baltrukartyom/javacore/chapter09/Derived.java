package com.java.baltrukartyom.javacore.chapter09;

public class Derived extends Protection {
    Derived(){
        System.out.println("Конструктор подкласса");
        System.out.println("n = " + n);
        // доступно только для класса
        // System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
class SamePackage{
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Конструктор этого же пакета");
        System.out.println("n = " + p.n);
        // доступно только для класса
        // System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
// При наследовании из другого пакета доступны только методы и переменные protected and public
// без наследования доступен только public