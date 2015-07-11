package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RandomNumberPicker comp = new RandomNumberPicker();
        int numberPicked = comp.getChoice();
        GuessChecker checker = new GuessChecker();

        ArrayList<Integer> guessList = new ArrayList<Integer>();

        while (!(checker.getGuessIsRight())){
            System.out.println("Please make a guess between 1 and 100:");
            Scanner user_input = new Scanner(System.in);

            //put a try catch in here
            try {
                String userGuess = user_input.next();

                // create int from guess

                int userInputNum = Integer.parseInt(userGuess);

                if (userInputNum > 0 && userInputNum <= 100) {

                    // put a guess in the array
                    guessList.add(userInputNum);

                    // check if the guess is correct
                    checker.setGuess(userInputNum);
                    checker.checkGuess(numberPicked);
                }else {
                    System.out.println("Your guess was not between 1 and 100, please guess again");
                }

            }catch(NumberFormatException e){
                System.out.println("That was not a valid input, please input a number.");
            }
        }
        System.out.print("Your guesses were : " + guessList.toString());

    }
}
