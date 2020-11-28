package Wisielec;

import java.util.Random;

public class WordsDatabase {
    private Random random = new Random();

    private final String[] words = {
            "Java",
            "Coca-Cola",
            "Czekolada",
            "Olowek",
            "Klawiatura"
    };

    public String getRandomWord() {
        int index = random.nextInt(words.length);
        return words[0];
    }
}
