package com.java.baltrukartyom.javacore.chapter05;

// Применение оператора break в качестве цивилизованной
// формы оператора qoto
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second:{
            third:{
                System.out.println("Предшествует оператору break.");
                if (t)
                    break second; //выход из блока second
                System.out.println("Этот оператор не будет выпоняться");
            }
                System.out.println("Этот оператор не будте выполняться");
            }
            System.out.println("Этот оператор следует за блоком second");
        }
    }
}
