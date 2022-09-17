package com.blz.logical.programs;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int i =1;  // initializes the i
        while (i<=num/2){
            if(num%i==0){
                sum+=i;
            }
            i++;
        }
    if (sum==num)
        System.out.println(num+" is a perfect number.");
    else
        System.out.println(num+" is not a perfect number.");
    }
}
