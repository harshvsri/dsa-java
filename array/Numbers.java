package com.harsh.array;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean loopContinue = false;
        int positiveCount  = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        do {
            System.out.print("Enter the number: ");
            int input = in.nextInt();
            if(input > 0) {
                positiveCount++;
            } else if( input < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.print("Do you want to input a number(Y/y for yes N/n for no): ");
            char reply = in.next().charAt(0);
            if(reply == 'y' || reply == 'Y') {
                loopContinue = true;
            } else {
                loopContinue = false;
            }
        } while(loopContinue);
        System.out.println("Poistives: "+positiveCount);
        System.out.println("Negatives: "+negativeCount);
        System.out.println("Zeroes: "+zeroCount);
        System.out.println("Thanks :)");
    }
}