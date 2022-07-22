// Write a program to sum of user input until users input ‘q’ from keyboard

import java.util.Scanner;

public class checkInput {
    public static void main(String args[]){
        int total = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter q to exit the program or any other character to continue");
        char ch = s.next().charAt(0);
        while(ch != 'q'){
            for(int i=0; ; i++){
                System.out.println("Enter a number: ");
                int x = s.nextInt();
                total += x;
            }
        }System.out.println("Sum of the entered numbers is: " + total);
        s.close();
        
    }
}
