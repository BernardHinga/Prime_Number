package org.example;

import java.util.ArrayList;

public class primeList {
    private int num;

    public primeList(int n) {
        this.num = n;
    }
    public void less_prime_list(){
        Prime prime = new Prime();
        ArrayList<Integer> nList = new ArrayList<Integer>();

        nList.add(2);

        for (int i = 3; i < num; i +=2) {
            prime.setNumber(i);

            if (prime.isPrime()) {
                nList.add(i);
            }
        }

        System.out.print(nList);
    }

}
