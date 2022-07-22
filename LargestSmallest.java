//Problem 1:10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.


import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        int n, num;
        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;  
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter: ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Enter the number: ");
            num = s.nextInt();
            if(num > max){
                max = num;
            }else if(num < min){
                min = num;
            }
        }
        System.out.println("Largest Number is : " + max);
        System.out.println("Smallest Number is : " + min);
        s.close();
    }
}
