package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    int target = rand.nextInt(9)+1;
    int guess;

    System.out.println("Please guess a number between 1-10:");
    guess = scan.nextInt();

    while (guess < 1 || guess > 10) {
        System.out.println("That number is not between 1-10, please enter again:");
        guess = scan.nextInt();
    }

    while(guess != target){
        System.out.println("Not correct, please guess again:");
        guess = scan.nextInt();

        while (guess < 1 || guess > 10) {
            System.out.println("That number is not between 1-10, please enter again:");
            guess = scan.nextInt();
        }
    }

    System.out.println("Congratuations!! You guessed correct!");
    }
}
