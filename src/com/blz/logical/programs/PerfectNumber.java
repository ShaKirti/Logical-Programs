package com.blz.logical.programs;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        int i =1;  // initializes the i with 1 because 1 is perfect for all numbers
        while (i<=num/2){
            if(num%i==0){
                sum+=i;
                System.out.println(sum);
            }
            i++;
        }

    if (sum==num)
        System.out.println(num+" is a perfect number.");
    else
        System.out.println(num+" is not a perfect number.");
    }
}
