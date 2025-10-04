package org.example;

import java.util.ArrayList;

public class primeList {
    // Instance variable to store the user's number
    int num;

    // Constructor initializes the number for comparison
    public primeList(int n) {
        this.num = n;
    }

    // Method to find and print all prime numbers less than 'num'
    public void less_prime_list(){
        Prime prime = new Prime(); // Create an instance of the Prime class
        ArrayList<Integer> nList = new ArrayList<Integer>(); // Dynamic list to store prime numbers

        /* Since 2 is already known as a prime number (and even),
         * we can add it manually to start the list.
         */
        nList.add(2);

        /* Loop through all odd numbers from 3 up to (but not including) 'num'
         * because even numbers (besides 2) can't be prime.
         */
        for (int i = 3; i < num; i += 2) {
            prime.setNumber(i); // Set the current number in the Prime object

            // Check if it's prime using the isPrime() method
            if (prime.isPrime()) {
                nList.add(i); // Add to the list if it's a prime number
            }
        }

        // Display the list of primes found below the given number
        System.out.print("Prime numbers less than " + num + " are:\n");
        for (int i : nList) {
            System.out.print(i + ", ");
        }
    }

}
