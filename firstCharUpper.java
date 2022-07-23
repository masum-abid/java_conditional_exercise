import java.util.Scanner;

public class firstCharUpper {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
    
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < message.length(); i++){
            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }else{
                foundSpace = true;
          }
        }
        message = String.valueOf(charArray);
        System.out.println("Message: " + message);
        sc.close();
      }
}

