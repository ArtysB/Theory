package com.java.baltrukartyom.javacore.chapter07;

//демонстрация перегрузки метода
public class OverloadDemo {
    void test(){
        System.out.println("методы отсутствуют");
    }
    void test(int a){
        System.out.println("a: " + a);
    }
    // Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b){
        System.out.println("a and b:" + a + " " + b);
    }
    // Перегружаемый метод, проверяющий наличие параметра типа double
    double test(double a){
        System.out.println("d: " + a);
        return a*a;
    }
}
class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.5);
        System.out.println("Результат вызова ob.test(123.5) " + result);
    }
}
