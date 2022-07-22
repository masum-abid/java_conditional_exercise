//Problem 1:1. Write a program to check if inputted letter is small or capital

import java.util.Scanner;

public class CheckUpperLower{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = scan.next().charAt(0);
        scan.close();

        if (Character.isUpperCase(ch)){
            System.out.println("Character is Uppercase");
        }else{
            System.out.println("Character is Lowercase");
        }
    }
}