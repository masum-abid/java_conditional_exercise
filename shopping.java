//Problem 3:2
// Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        int shirtQuantity, shareeQuantity;
        int shirtPrice = 1200;
        int shareePrice = 3500;
        int discount = 400;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("How many shirt do you need: ");
        shirtQuantity = sc.nextInt();
        System.out.println("How many sharee do you need: ");
        shareeQuantity = sc.nextInt();
    
        int totalShirtPrice = shirtQuantity * shirtPrice;
        int totalShareePrice = shareeQuantity * shareePrice;
        int totalPrice = totalShirtPrice + totalShareePrice;
        sc.close();

        if(shirtQuantity == 2 && shareeQuantity == 1){
            int finalPrice = totalPrice - discount;
            System.out.println("After disccount total price: " + finalPrice);
        }else{
            System.out.println("No discount available. Total price: " + totalPrice);
        }
        
      }
}
