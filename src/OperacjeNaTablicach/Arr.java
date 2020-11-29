package OperacjeNaTablicach;


import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int [][]  arr1 = {{1, 2, 3, 4}, {2, 4, 7}, {3, 5, 8, 4}};
        int [][] arr2 = {{2, 3}, {1, 1000, 2}, {3, 5, 8, 4}};
        int [][] arr3 = returnLargerArray(arr1, arr2);

    }

     static int [][] returnLargerArray(int [][] x, int [][] y) {
        int sumX = 0;
        int sumY = 0;

        for (int[] ints : x) {
            for (int anInt : ints) {
                sumX += anInt;
            }
        }

        for (int[] ints : y) {
            for (int anInt : ints) {
                sumY += anInt;
            }
        }

        return (sumX > sumY) ? x : y;
    }


}
