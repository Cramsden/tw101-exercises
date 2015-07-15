package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {
        int number = n;
        List<Integer> primeFacts;
        Set<Integer> primesSet = new HashSet<>();
        for (int i=2;i<=number;i++) {
            if (number % i == 0) {
                primesSet.add(i);
                number = number / i;
                i--;
            }
        }
        primeFacts = new ArrayList<>(primesSet);
        System.out.print(primeFacts);
        return primeFacts;
    }
}
