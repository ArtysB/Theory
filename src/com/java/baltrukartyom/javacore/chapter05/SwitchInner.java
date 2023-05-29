package com.java.baltrukartyom.javacore.chapter05;

public class SwitchInner {
    public static void main(String[] args) {
        int count = 1;
        int target = 0;
        switch (count){
            case 1:
                switch (target){    // сложенный оператор switch
                    case 0:
                        System.out.println("target равен 0");
                        break;
                    case 1:        // колнфликты с внешним оператором отсутствуют
                        System.out.println("target равен 1");
                        break;
                }
        }
    }
}
