package com.java.baltrukartyom.javacore.Algoritm;

public class Second {
    public static void main(String[] args) {
        int[] arr = {4,5,6,6,8};
        System.out.println(sameNumbers(arr));
        int[] arr2 = {4,5,6,7,8};
        System.out.println(sameNumbers(arr2));
    }
    private static boolean sameNumbers(int[] array){
        for (int i = 0; i < array.length; i ++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
