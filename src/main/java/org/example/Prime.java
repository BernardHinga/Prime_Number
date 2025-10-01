package org.example;

public class Prime {
    // Encapsulation: 'number' is private and can only be accessed via setters/getters
    private int number;

    // Mutator (setter): allows controlled modification of the private variable 'number'
    public void setNumber(int number) {
        this.number = number;
    }

    // Accessor (getter): allows controlled access to the private variable 'number'
    public int getNumber() {
        return number;
    }

    // Method to check if the number is prime
    public boolean isPrime() {
        int n = getNumber(); // Get the value stored inside 'number'

        // Any number <= 1 is not prime
        if (n <= 1) {return false;}

        // 2 is prime (special case because it's the only even prime number)
        if (n == 2) {return true;}

        // Exclude all other even numbers
        if (n % 2 == 0) {return false;}

        // Only need to check up to the square root of 'n'
        // because if n = a * b, one of a or b must be <= sqrt(n).
        int limit = (int) Math.sqrt(n) + 1;

        // Loop through odd numbers from 3 to limit
        for (int i = 3; i <= limit; i += 2) {
            // If n is divisible by any of these numbers, it's not prime
            if (n % i == 0) {return false;}
        }

        // If no divisors were found, n is prime
        return true;
    }
}
