package com.java.baltrukartyom.javacore.chapter08;

// Применение абстрактных методов и классов
abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    // теперь метод area() объявляется абстрактным
    abstract double area();
}
class Rectangle2 extends Figure2{
    Rectangle2(double a, double b){
        super(a,b);
    }
    // переопределить метод area() для четырехугольника
    double area(){
        System.out.println("В области четырехугольника");
        return dim1*dim2;
    }
}
class Triangle2 extends Figure{
    Triangle2(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("В области треугольника");
        return dim1 * dim2/2;
    }
}
class AbstractAreas{
    public static void main(String[] args) {
        // Figure f = new Figure(10,10); //теперь недопустимо
        Rectangle2 r = new Rectangle2(9,5);
        Triangle2 t = new Triangle2(10,8);
        Figure2 regref; // Верно, но объект не создается
        regref = r;
        System.out.println("Площадь равна: " + regref.area());
        //regref = t; //ЗАДАТЬ ВОПРОС ПО ПОВОДУ ЭТОГО
        System.out.println("Площадь равна: " + regref.area());
    }
}