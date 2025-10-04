package org.example;

import java.util.ArrayList;

public class primeList {
    int num;

//    Constructor
    public primeList(int n) {
        this.num = n;
    }
    public void less_prime_list(){
        Prime prime = new Prime();
        ArrayList<Integer> nList = new ArrayList<Integer>();

/* Since 2 is already a prime number and already accounted for in
 * the main class, we can use it to initialize the array
 */
        nList.add(2);

//        Loop through all odd numbers and check which are prime, storing them in nlist.
        for (int i = 3; i < num; i +=2) {
            prime.setNumber(i);

            if (prime.isPrime()) {
                nList.add(i);
            }
        }

        System.out.print("Prime numbers less than " + num + " are:\n");
//        Print out the list
        for (int i : nList) {
            System.out.print(i + ", ");
        }
    }

}
