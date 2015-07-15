package com.thoughtworks.tw101.introductory_programming_exercises;


public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        System.out.println("Isosceles Triangle:");
        drawAnIsoscelesHelper(n, false);
    }

    private static void drawAnIsoscelesHelper(int n, boolean hasName){
        for (int i=1; i<= n; i++) {
            if (i==n && (hasName ==true)){
                System.out.println("Carson");
            }else {
                int whiteSpaceCount = n - i;
                String whiteSpace = repeat(" ", whiteSpaceCount);
                String stars = repeat("x", i + (i - 1));
                String line = whiteSpace + stars;
                System.out.print(line + "\n");
            }
        }

    }


    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        System.out.println("Diamond: ");
        drawAnIsoscelesHelper(n,false);
        drawUpsideDownTriangle(n);
    }

    private static void drawUpsideDownTriangle(int n){
        for (int i=n-1; i>0; i--) {
           // System.out.println(i);

            int whiteSpaceCount = n-i;
            String whiteSpace = repeat(" ", whiteSpaceCount);
            String stars = repeat("x", i + (i - 1));
            String line = whiteSpace + stars;
            System.out.print(line + "\n");
        }
    }
    //    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        System.out.println("Diamond with Name:");
        drawAnIsoscelesHelper(n, true);
        drawUpsideDownTriangle(n);

    }

    private static String repeat(String s, int n) {
        String repeated = "";
        for (int i=0; i<n; i++){
            repeated += s;
        }
        return repeated;
    }

}