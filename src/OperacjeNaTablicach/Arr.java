package OperacjeNaTablicach;


public class Arr {
    public static void main(String[] args) {
        int [][]  arr1 = {{1, 2, 3, 4}, {2, 4, 7}, {3, 5, 8, 4}};
        int [][] arr2 = {{2, 3}, {1, 1000, 2}, {3, 5, 8, 4}};
        int [][] arr3 = returnLargerArray(arr1, arr2);

    }

    public static int [][] returnLargerArray(int [][] x, int [][] y) {
        int sumX = 0;
        int sumY = 0;

        for (int i = 0; i < x.length; i++ ) {
            for(int j = 0; j < x[i].length; j++) {
                sumX += x[i][j];
            }
        }

        for (int i = 0; i < y.length; i++ ) {
            for(int j = 0; j < y[i].length; j++) {
                sumY += y[i][j];
            }
        }

        return (sumX > sumY) ? x : y;
    }
}
