package primefinder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nPrimes;
        
        System.out.println("this is a simple program to find a given number of primes.\nplease enter the number of primes you would like to find.");
        Scanner userInput = new Scanner(System.in);
        
        nPrimes = userInput.nextInt();
        findPrimes(nPrimes);
    }
    
    private static void findPrimes(int nPrimes) {
        int primesFound = 0;
        int numToCheck = 3;
        boolean prime = true;

        while (primesFound != nPrimes) {
            for (int i = 2; i < numToCheck; i++) {

                if (numToCheck % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                primesFound++;
                System.out.println(numToCheck + "\t\t" + primesFound + "\t\t" + (float)primesFound / (float)nPrimes * 100f + "%");
            }
            prime = true;
            numToCheck++;
        }

        
    }
    
}
