package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        // Create an instance of the Prime class (object)
        Prime prime = new Prime();

        // Scanner is used to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Please enter a number to check if it's prime:");

        // Read the user’s input and store it inside the Prime object
        prime.setNumber(input.nextInt());

        // Check if the number is prime by calling the isPrime() method
        if (prime.isPrime()){
            System.out.println(prime.getNumber() + " is a prime number");
        } else {
            System.out.println(prime.getNumber() + " is not a prime number");
        }
    }
}
