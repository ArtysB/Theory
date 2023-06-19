package com.java.baltrukartyom.javacore.Algoritm;

import java.util.Arrays;
import java.util.HashMap;

public class First {
    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17};
        System.out.println(Arrays.toString(algoMethod(array, 23)));
    }

    private static int[] algoMethod(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i])) {
                return new int[]{i, map.get(k - arr[i])};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, 1};
    }
}
