package Day5;
import java.util.*;

public class WordGame {

    public static final int MaxAttempt = 5;

    public static String selectRandomWord() {
        Random random = new Random();

        System.out.println("Welcome to the WORD GUESSING GAME!");
        System.out.println("This game requires you to guess the word based on the character length");
        System.out.println("You only have " + MaxAttempt +" 5 attempts so choose it wisely!\n");

        List<String> WORDS = new ArrayList<>(Arrays.asList("actual","formal","argument","length","applied"));

        int randomIndex = random.nextInt(WORDS.size());

        return WORDS.get(randomIndex);
    }

    public static String hideWord(String word) {
        StringBuilder hiddenWord = new StringBuilder();

        for(int i=0 ; i< word.length(); i++){
            hiddenWord.append("_ ");
        }
        return hiddenWord.toString().trim();

    }

    public static char getPlayerGuess() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select a char: ");
        String input = scanner.nextLine();

        while (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Invalid input. Please enter a single letter: ");
            input = scanner.nextLine();
        }
        return input.toLowerCase().charAt(0);
    }

    public static boolean isGuessCorrect(String word, char guess) {
        return word.indexOf(guess) >= 0;
    }

    public static String updateHiddenWord(String word, String hiddenWord, char guess) {
        StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord);
        for (int i = 0; i <word.length(); i++) {
            if (word.charAt(i) == guess) {
                updatedHiddenWord.setCharAt(i * 2, guess);
            }
        }
        return updatedHiddenWord.toString();
    }

    public static void displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft) {
        if (hiddenWord.contains("_")) {
            System.out.println("Game Over! The correct word was: " + wordToGuess);
        } else {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        }
    }
}

