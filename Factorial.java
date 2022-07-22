//Write  a program to find the factorial of a given number

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            long factorial = 1;
            for(int i = 1; i <= n; ++i){
                factorial = factorial*i;
            }
            System.out.println("factorial of " + n + " is: " + factorial);
        }
    }
}
