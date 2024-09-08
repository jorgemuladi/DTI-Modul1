package org.example;


import Day5.WordGame;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the WORD GUESSING GAME!");
        System.out.println("This game requires you to guess the word based on the character length");
        System.out.println("You only have 5 attempts so choose it wisely!\n");

        String selectedWord = WordGame.selectRandomWord();
        String hiddenWord = WordGame.hideWord(selectedWord);

        System.out.println("Hidden word: " + hiddenWord);

        char guess = WordGame.getPlayerGuess();
        System.out.println("You guessed: " + guess);
    }
}