package com.thoughtworks.tw101.exercises.exercise7;
//import java.util.Random;
import java.util.Scanner;


// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {
        // Pick a number using picker class
        RandomNumberPicker comp = new RandomNumberPicker();
        int numberPicked = comp.getChoice();
        GuessChecker checker = new GuessChecker();
        System.out.println("Please make a guess between 1 and 100:");
        checker.guessCheckPlay(numberPicked);

    }


}
