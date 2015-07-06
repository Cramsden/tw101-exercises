package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int count = 0;

    void increment(){
        count++;
    }
    void total(){
        System.out.print("increment was called " + count + " times");
    }


}
