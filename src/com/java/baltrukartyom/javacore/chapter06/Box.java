package com.java.baltrukartyom.javacore.chapter06;

/*
Программа, использующая класс Box
Присвоить исходному классу имя BoxDemo.java
 */
public class Box {
    double width;
    double height ;
    double depth;
    double volume(){
        return width*height*depth;
    }
}
class BoxDemo{
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol ;
// присвоить значение переменным экземпляра myBox
        myBox.width=10;
        myBox.height=20;
       myBox.depth=15;
// рассчитать объем параллелепипеда
        vol = myBox.depth* myBox.height* myBox.width;
        System.out.println("Объем равен " + vol);
    }
}
class BoxDemo2{
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox1.width=10;
        myBox1.height=20;
        myBox1.depth=15;
        myBox2.width=3;
        myBox2.height=6;
        myBox2.depth=9;
        vol = myBox1.depth* myBox1.height* myBox1.width;
        System.out.println("Объем равен: " + vol);
        vol = myBox2.depth* myBox2.height* myBox2.width;
        System.out.println("Объем равен: " + vol);

    }
}
