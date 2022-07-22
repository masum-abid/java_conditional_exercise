//Problem 1:8
//Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.

import java.util.Scanner;

public class RandomNumber {
    public static void main(String args[]){
        double number1 = Math.random();
        double number2 = Math.random();
        System.out.println("The numbers are: " + number1 + " and " + number2);
        Scanner s = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i<10; i++){
            System.out.println("Take a guess about the numbers: ");
            double user_number = s.nextDouble();
            if(user_number == number1 || user_number == number2){
                count += 1;
            }
        }
        System.out.println("Your total point is: " + count);
        s.close();
    }
}
