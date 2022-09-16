package com.blz.logical.programs;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of terms do you want to print:");
        int n = s.nextInt();

        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <=n ; i++) {
            System.out.print(firstTerm+" ");
            int nextTerm = firstTerm + secondTerm;

            //here we are assigning the secondTerm value to the firstTerm value

            firstTerm = secondTerm;

            //here we are updating the secondTerm with the new value of nexTerm that comes by adding firstTerm
            // and secondTerm

            secondTerm = nextTerm;
            //System.out.println(nextTerm);
        }
    }
}
