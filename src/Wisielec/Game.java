package Wisielec;

import java.util.Scanner;

public class Game {
    private static final int NEXT = 1;
    private static final int END = 2;

    private WordsDatabase db = new WordsDatabase();
    private Scanner sc = new Scanner(System.in);

    public void loop() {
        int option = NEXT;
        while (option != END) {
            play();
            showOptions();
            option = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Bye!");
    }
}
