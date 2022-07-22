//Write a program to check balance and withdraw money from ATM booth using if else or switch case

import java.util.Scanner;

public class atmTransac{
    public static void main(String args[] ){ 
        int balance = 50000, withdraw;
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Check Balance");
            System.out.print("Choose the operation you want to perform: ");
            int n = s.nextInt();
 
            switch(n){
                case 1:
                System.out.print("Enter money to be withdrawn: ");
                withdraw = s.nextInt();
                if(balance >= withdraw){
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }else{
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.println("Balance : "+ balance);
                System.out.println("");
                s.close();
                break;
            }
        }
    }
}