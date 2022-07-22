//Problem 1:3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241

import java.util.Scanner;

public class DecimalCheck {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Input floating point number: ");
            double x = in.nextDouble();
            System.out.println("Input floating point number: ");
            double y = in.nextDouble();

            x = Math.round(x * 100);
            y = Math.round(y * 100);

            if(x == y){
                System.out.println("Numbers are same up to two decimal point");
            }else{
                System.out.println("Numbers are different");
            }
        }
    }
}
