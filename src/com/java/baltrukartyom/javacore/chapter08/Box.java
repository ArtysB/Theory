package com.java.baltrukartyom.javacore.chapter08;

// В э той программе наследование применяется
// для расширения класса Вох
public class Box {
    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Box(Box ob) {  // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствие размеров
    Box() {
        width = -1;       // значение -1 служит для обозначения
        height = -1;        // неинициализированного параллелепипеда
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
// расширить класс Вох, включив в него поле веса
class BoxWeight extends Box{
    double weight;   // вес параллелепипеда
    // Конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
}
class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(10,20,15,34.3);
        BoxWeight boxWeight1 = new BoxWeight(2,3,4,0.076);
        double vol;
        vol = boxWeight.volume();
        System.out.println("Объем boxWeight = " + vol);
        System.out.println("Вес boxWeight = " + boxWeight.weight);
        System.out.println(

        vol = boxWeight1.volume());
        System.out.println("Объем boxWeight1 = " + vol);
        System.out.println("Вес boxWeight1 = " + boxWeight1.weight);


    }
}