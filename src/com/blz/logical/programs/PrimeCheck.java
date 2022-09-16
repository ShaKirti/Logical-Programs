package com.blz.logical.programs;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        for (int i = 2; i<=num/2; i++){
            //Condition for non-prime
            if(num%2==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num+" is prime number.");
        else
            System.out.println(num+" is not a prime number.");
    }
}
