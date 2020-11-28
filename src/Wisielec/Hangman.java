package Wisielec;

public class Hangman {
    private static final int MISTAKES = 8;

    private String guessWord;
    private String guessWordDisplay;
    private int guesses;
    private char[] userGuesses;
    private int mistakes;

    public Hangman(String guessWord) {
        this.guessWord = guessWord;
        userGuesses = new char[64];
        generateDisplay();
    }

    public String getGuessWordDisplay() {
        return guessWordDisplay;
    }

    public String getGuessWord() {
        return guessWord;
    }

    private void generateDisplay() {
        StringBuilder display = new StringBuilder();
        for(int i = 0; i < guessWord.length();i++) {
            char nextChar = guessWord.charAt(i);
            if(arrayContains(userGuesses, nextChar))
                display.append(nextChar);
            else if(nextChar == ' ')
                display.append(' ');
            else
                display.append("*");
        }
        this.guessWordDisplay = display.toString();
    }

    private boolean arrayContains(char[] array, char letter) {
        for(char element : array) {
            if(element == letter)
                return true;
        }
        return false;
    }

    public boolean userLost() {
        return mistakes >= MISTAKES;
    }

    public boolean userWon() {
        return !guessWordDisplay.contains("*");
    }

    public void checkLetter(char letter) {
        if (!arrayContains(userGuesses, letter)) {
            checkMistake(letter);
            rememberGuess(letter);
            generateDisplay();
        }
    }

    private void checkMistake(char letter) {
        if(guessWord.indexOf(letter) == -1)
            mistakes++;
    }

    private void rememberGuess(char letter) {
        userGuesses[guesses] = letter;
        guesses++;
    }
}
