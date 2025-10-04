package org.example;

public class upperPrime {
    int num;

    Prime prime = new Prime();

    public upperPrime(int n) {
        this.num = n;
    }

    public void greaterPrime(){=
        for (int i = num+1; i <= num+50; i++) {
            prime.setNumber(i);

            if (prime.isPrime()) {
                System.out.println("\nPrime number after " + num + " is: " + i + ".\n");
                break;
            }
        }
    }
}
