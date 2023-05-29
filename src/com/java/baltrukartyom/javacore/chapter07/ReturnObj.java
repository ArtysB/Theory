package com.java.baltrukartyom.javacore.chapter07;

// Возврат объекта
public class ReturnObj {
    int a;

    ReturnObj(int i) {
        a = i;
    }
    ReturnObj incrByTen(){
        ReturnObj temp = new ReturnObj(a + 10);
        return temp;
    }
}
class RetOb{
    public static void main(String[] args) {
        ReturnObj ob1 = new ReturnObj(2);
        ReturnObj ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2 после второго увеличения значения " + ob2.a);
    }
}