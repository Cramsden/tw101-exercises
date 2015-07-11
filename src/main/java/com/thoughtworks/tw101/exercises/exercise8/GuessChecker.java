package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by carsonramsden on 7/9/15.
 */
public class GuessChecker {
    private boolean guessIsRight;
    int userGuessNum;

    public GuessChecker(){
        guessIsRight = false;
    }

    public boolean getGuessIsRight(){
        return guessIsRight;
    }

    public void setGuess(int userInputNum){
        userGuessNum = userInputNum;
    }


    public void checkGuess(int numberChoice){
        if (userGuessNum == numberChoice) {
            System.out.println("You have guessed my number, you win!!");
            guessIsRight = true;
        }
        else{
            if(userGuessNum > numberChoice) {
                System.out.println("Your guess is too big, try lower");
            }
            if(userGuessNum < numberChoice) {
                System.out.println("Your guess is too small, try higher");
            }
            guessIsRight = false;
        }
    }
}
