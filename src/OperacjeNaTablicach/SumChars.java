package OperacjeNaTablicach;

import java.util.Arrays;

public class SumChars {
    public static void main(String[] args) {
        String [] arr = {"aa", "bb"};
        String [] arr1 = {"xxx", "yyy"};

        returnLarger(arr, arr1);

    }

        static int sum(String [] arr) {
            return Arrays.stream(arr)
                    .mapToInt(String::length)
                    .sum();
        }

        static String[] returnLarger(String[] array1, String[] array2) {
            int arr1 = sum(array1);
            int arr2 = sum(array2);

            return arr1 > arr2 ? array1 : array2;
        }
}
