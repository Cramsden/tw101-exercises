package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;
/**
 * Created by carsonramsden on 7/8/15.
 */
public class GuessChecker {
    private int userGuessNum;
    private boolean guessCorrect=false;


    public void guessCheckPlay(int numberChoice){
        if (!guessCorrect) {

            Scanner user_input = new Scanner(System.in);

            try {
                String userGuess = user_input.next();

                // create int from guess
                createIntFromGuess(userGuess);


            }
            catch(NumberFormatException e){
                System.out.println("That was not a valid input, please try again");
            }

            checkGuess(numberChoice);


        }
    }
    public void checkGuess(int numberChoice){
        if (userGuessNum < 1 || userGuessNum > 100) {
            System.out.println("Your guess was not between 1 and 100, please guess again");
        }
        else if (userGuessNum == numberChoice) {
            System.out.println("You have guessed my number, you win!!");
            guessCorrect = true;
        }
        else {
            if (userGuessNum > numberChoice) {
                System.out.println("Your guess is too big, try lower");
                guessCheckPlay(numberChoice);
            }
            if (userGuessNum < numberChoice) {
                System.out.println("Your guess is too small, try higher");
                guessCheckPlay(numberChoice);
            }
        }

    }

    public void createIntFromGuess(String guess){
        userGuessNum = Integer.parseInt(guess);
    }
}
