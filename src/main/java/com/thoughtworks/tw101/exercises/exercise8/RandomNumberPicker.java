package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by carsonramsden on 7/9/15.
 */
public class RandomNumberPicker {

    private int numberChoice;

    public RandomNumberPicker() {

        int max = 100;
        int min = 1;

        //Random rand = new Random();
        // int choice = rand.nextInt((max - min) + 1) + min;
        numberChoice = (int)(Math.random() * (max - min) + min);

        System.out.println("I have picked my number, I am ready for your guess.");
    }
    public int getChoice(){
        return numberChoice;
    }
}
