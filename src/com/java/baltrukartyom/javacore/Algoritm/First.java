package com.java.baltrukartyom.javacore.Algoritm;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
    int[] array = {3,8,15,17};
        System.out.println(Arrays.toString(algoMethod(array,23)));
    }
    private static int[] algoMethod(int[] arr, int k){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i]+arr[j]==k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
