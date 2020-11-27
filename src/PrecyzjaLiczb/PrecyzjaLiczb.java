package PrecyzjaLiczb;

import java.util.Scanner;

public class PrecyzjaLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        N = scanner.nextInt();

        if(N > 0) {
            for (double i = 0.0; i < N + 0.1; i += 0.1) {
                System.out.printf("%.1f ", i);
            }
        }
        else if(N < 0) {
            for(double i = 0; i > N - 0.1; i -= 0.1) {
                System.out.printf("%.1f ", i);
            }
        }
    }
}
