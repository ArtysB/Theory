package com.java.baltrukartyom.javacore.chapter09;

// Реализовать интерфейс МyIF
public class MyIfImp implements MyIf{
    // В этом классе должен быть реализован только метод getNumber(),
    // определенный в интерфейсе МyIF .
    // А вызов метода getString () разрешается по умолчанию
    public int getNumber(){
        return 100;
    }
}
class DefaultMethodDemo{
    public static void main(String[] args) {
        MyIfImp obj = new MyIfImp();
        // Метод getNumber() можно вызвать, т.к. он явно реализован
        // в классе МyIfImp:
        System.out.println(obj.getNumber());
        // Метод getString() также можно вызвать, т.к. в интерфейсе
        // имеется его реализация по умолчанию:
        System.out.println(obj.getString());
    }
}