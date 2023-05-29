package com.java.baltrukartyom.javacore.chapter04;

// сдвиг влево значения byte
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64,b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Первоначальное значение a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
// применение сдвига влево в качестве быстрого способа умножения на 2
class MultByTwo{
    public static void main(String[] args) {
        int num = 0xFFFFFFE;
        for(int i = 0; i < 4; i++){
            num = num << 1;
            System.out.println(num);
        }
    }
}
