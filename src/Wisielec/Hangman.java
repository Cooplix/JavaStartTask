package Wisielec;

public class Hangman {
    private static final int MISTAKES = 8;

    private String guessWord;
    private String guessWordDisplay;
    private char[] userGuesses;
    private int mistakes;

    public Hangman(String guessWord) {
        this.guessWord = guessWord;
        userGuesses = new char[64];
        generateDisplay();
    }

    private void generateDisplay() {
    }

    public boolean userLost() {
        return mistakes >= MISTAKES;
    }

    public boolean userWon() {
        return !guessWordDisplay.contains("*");
    }

    public void checkLetter(char letter) {
        if(!arrayContains(userGuesses, letter));
        checkMistake(letter);
        rememberGuess(letter);
        generateDisplay();
    }


}
