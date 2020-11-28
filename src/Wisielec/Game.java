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

    private void showOptions() {
        System.out.println(NEXT + " - Dalej");
        System.out.println(END + " - Koniec");
    }

    private void play() {
        Hangman hangman = new Hangman(db.getRandomWord());
        do {
            System.out.println("\nHaslo:");
            String gueessWordDisplay = hangman.getGuessWordDisplay();
            System.out.println(gueessWordDisplay);
            System.out.println("Podaj litere:");
            String line = sc.nextLine();
            char userGuess = line.charAt(0);
            hangman.checkLetter(userGuess);
        } while (!hangman.userLost() && !hangman.userLost());
            System.out.println();
            if(hangman.userLost())
                System.out.println("You are lost :((");
            else if(hangman.userWon()) {
                System.out.println("You are WIN!!! :)))");
            }
            System.out.printf("Haslo: %s\n\n", hangman.getGuessWord());

    }
}
