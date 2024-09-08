package Day5;

import java.util.*;

public class WordGame {
    public static String selectRandomWord() {
        Random random = new Random();

        List<String> WORDS = new ArrayList<>(Arrays.asList("actual","formal","argument","length","applied"));

        int randomIndex = random.nextInt(WORDS.size());

        return WORDS.get(randomIndex);
    }

    public static String hideWord(String word) {
        StringBuilder hiddenWord = new StringBuilder();


        for(int i=0 ; i< word.length(); i++){
            hiddenWord.append("_ ");

        }
        return hiddenWord.toString();
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

}

