//Problem 3:5
//Write a program that will count how many vowels in the given string:
//input: "roadtosdet"
//Output: 4

import java.util.Scanner;

public class countVowel {
    public static void main(String args[]){
        int count = 0;
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
  
        for (int i=0 ; i<data.length(); i++){
           char ch = data.charAt(i);
           if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
              count ++;
           }
        }
        System.out.println("Number of vowels in the given data is " + count);
     }
}
