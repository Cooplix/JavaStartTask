package Romb;

import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int romb = sc.nextInt();
        romb(romb);

    }

    public static void romb(int romb) {
        for(int i = 0; i < romb; i++) {
            for(int j = 0; j < romb - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < romb; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
