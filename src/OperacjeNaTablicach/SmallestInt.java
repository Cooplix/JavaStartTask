package OperacjeNaTablicach;

public class SmallestInt {
    public static void main(String[] args) {
        int[] arr = {10,1, 2 ,3, 4, -5, 5, 15, 6, 7};
        System.out.println(smallest(arr));
    }

    static int smallest(int [] arr) {
        int x = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(x > arr[i])
                x = arr[i];
        }

        return x;
    }
}
