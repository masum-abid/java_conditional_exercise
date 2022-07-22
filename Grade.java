//Problem 1:2. Write a program to calculate GPA and find grade

import java.util.Scanner;

public class Grade{
    public static void main(String args[]){
        int marks[] = new int[5];
        int i;
        float total = 0, avg;
        try (Scanner scanner = new Scanner(System.in)) {
            for(i=0; i<5; i++){
                System.out.println("Enter marks of the subject " + (i+1) + ":");
                marks[i] = scanner.nextInt();
                total = total + marks[i];
            }
        }

        avg = total/5;
        System.out.println("The student's Grade is: ");
        if(avg>=80){
            System.out.print("A+");
        }else if(avg>=70 && avg<80){
            System.out.print("A");
        }else if(avg>=60 && avg<70){
            System.out.print("B");
        }else if(avg>=50 && avg<60){
            System.out.print("C");
        }else if(avg>=40 && avg<50){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}
