//problem 3:4. Writea program that will give following output:
//Input: chattogram
//Output: C8M

import java.util.Scanner;

public class countMiddlecharacter {
    public static void main(String[] args) {
        System.out.println("Enter your district name: ");
        Scanner sc = new Scanner(System.in);
        String division = sc.nextLine();
        String firstIndex = String.valueOf(division.charAt(0)).toUpperCase();
        String secondIndex = String.valueOf(division.charAt(division.length()-1)).toUpperCase();
    
        int index = division.lastIndexOf('a') + 1;
    
        String result = firstIndex + index + secondIndex;
        System.out.println(result);
        sc.close();
    }
}
