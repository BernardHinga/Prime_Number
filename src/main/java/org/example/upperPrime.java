package org.example;

public class upperPrime {
    // Instance variable storing the number entered by the user
    int num;

    // Create a Prime object for prime checking
    Prime prime = new Prime();

    // Constructor: assigns the number entered by the user
    public upperPrime(int n) {
        this.num = n;
    }

    // Method to find and display the next prime number greater than 'num'
    public void greaterPrime(){
        /* Loop through numbers starting from num + 1 up to num + 50
         * (an arbitrary range large enough to guarantee a next prime is found).
         */
        for (int i = num + 1; i <= num + 50; i++) {
            prime.setNumber(i); // Assign current number to Prime object

            if (prime.isPrime()) { // If it's prime, print and exit loop
                System.out.println("\nPrime number after " + num + " is: " + i + ".\n");
                break;
            }
        }
    }
}
