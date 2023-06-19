package com.java.baltrukartyom.javacore.Algoritm;

import java.util.HashSet;
import java.util.Set;

public class Second {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 6, 8};
        System.out.println(sameNumbers(arr));
    }

    private static boolean sameNumbers(int[] array) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : numSet) {
            if (numSet.contains(num)) {
                return true;
            } else {
                numSet.add(num);
            }
        }
        return false;
    }
}
