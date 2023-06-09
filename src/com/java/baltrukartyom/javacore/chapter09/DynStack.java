package com.java.baltrukartyom.javacore.chapter09;

// Реализация "наращиваемого" стека
public class DynStack implements IntStack{
    private int stck[];
    private int tos;

    DynStack(int size){
        stck = new int[size];
        tos = -1;
    }

    public void push(int item){
        // если стек заполнен, выделить память под стек большего размера
        if(tos==stck.length-1){
            int[] temp = new int[stck.length*2]; // удвоить размер стека
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }else{
            stck[++tos] = item;
        }
    }
    // извлечь элементы из стека
    public int pop(){
        if(tos < 0){
            System.out.println("Стек не загружен");
            return 0;
        }else{
            return stck[tos--];
        }
    }
}
class IfTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        // В этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }
        System.out.println("Стек mystack1: ");
        for (int i = 0; i < 12; i++) {
            mystack1.pop();
        }
        System.out.println("Стек mystack2: ");
        for (int i = 0; i < 20; i++) {
            mystack2.pop();
        }
    }
}
class IfTest3{
    public static void main(String[] args) {
        IntStack mystack; // создаем переменную ссылки на интерфейс
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;
        for (int i = 0; i < 12; i++){
            mystack.push(i);
        }
        mystack = fs;
        for (int i = 0; i < 8; i++){
            mystack.push(i);
        }
        mystack = ds;
        System.out.println("Значения в динамическом стеке");
        for (int i = 0; i < 12; i++){
            mystack.pop();
        }
        mystack = fs;
        System.out.println("Значения в фиксированном стеке");
        for (int i = 0; i < 8; i++){
            mystack.pop();
        }
    }
}