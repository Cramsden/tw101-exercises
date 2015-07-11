package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;
/**
 * Created by carsonramsden on 7/8/15.
 */
public class GuessChecker {
    private int userGuessNum;


    public void guessCheckPlay(int numberChoice){
        while (true) {

            System.out.println("Please make a guess between 1 and 100:");
            Scanner user_input = new Scanner(System.in);

            try {
                String userGuess = user_input.next();

                // create int from guess
                userGuessNum = Integer.parseInt(userGuess);

                // check guess
                if (userGuessNum < 1 || userGuessNum > 100)
                {
                    System.out.println("Your guess was not between 1 and 100, please guess again");
                }
                else if (userGuessNum == numberChoice) {
                    System.out.println("You have guessed my number, you win!!");
                    break;
                } else {
                    if (userGuessNum > numberChoice) {
                        System.out.println("Your guess is too big, try lower");
                    }
                    if (userGuessNum < numberChoice) {
                        System.out.println("Your guess is too small, try higher");
                    }
                }
            }catch(NumberFormatException e){
                System.out.println("That was not a valid input, please try again");
            }
        }
    }
}
