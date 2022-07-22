//Problem 1:5. Write a program to sum of numbers which only divisible by 5 from 1 to 100 

public class DivisibleByFive {
    public static void main(String args[]){
        int n = 0;
        for(int i = 1; i<=100; i++){
            if(i % 5 == 0){
                System.out.println(i + ",");
                n += i;
            }
        }
        System.out.println("The sum of the numbers are: " + n);
    }
}
