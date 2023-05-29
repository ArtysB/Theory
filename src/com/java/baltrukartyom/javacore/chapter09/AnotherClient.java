package com.java.baltrukartyom.javacore.chapter09;

// Еще одна реализация интерфейса Callback
public class AnotherClient implements Callback{
    // реализовать интерфейс Callback
    public void callback(int p){
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равен: " +(p*p));
    }
}
class TestIface2{
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;          // теперь переменная с ссылается на объект типа AnotherClient
        c.callback(42);
    }
}