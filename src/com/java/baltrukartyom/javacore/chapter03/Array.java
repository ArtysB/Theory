package com.java.baltrukartyom.javacore.chapter03;

// демонстрация применения одномерного массива
public class Array {
    public static void main(String[] args) {
        int[] month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("В апреле " + month_days[3] + " дней");
    }
}

class AutoArray {
    public static void main(String[] args) {
        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("В апреле " + month_days[3] + " дней");
    }
}

class Average {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++) {
            result += nums[i];
        }
        System.out.println("Среднее значение равно " + result / 5);
    }
}

class TwoArray {
    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}

// инициализируем двухмерный массив
class Matrix {
    public static void main(String[] args) {


        double[][] m = {
                {0 * 0, 1 * 0, 2 * 0, 3 * 0},
                {0 * 1, 1 * 1, 2 * 1, 3 * 1},
                {0 * 2, 1 * 2, 2 * 2, 3 * 2},
                {0 * 3, 1 * 3, 2 * 3, 3 * 3}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}

class ThreeDMatrix {
    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 5; k++){
                    System.out.print(threeD[i][j][k] + " ");

                }
                System.out.println();
            }
        }
    }
}