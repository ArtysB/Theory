package com.java.baltrukartyom.javacore.chapter09;

public class Client implements Callback{
    // Реализовать интерфейс Callback
    public void callback(int p){
        System.out.println("Метод callback, вызываемый со значением " + p);
    }
    void nonIfaceMath(){
        System.out.println("В классах реализующих интерфейсы,"
        + "могут определяться собственные методы");
    }
}
class TestIface{
    public static void main(String[] args) {


    Callback c = new Client();
    c.callback(42);
}
}