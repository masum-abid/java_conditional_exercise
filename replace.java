//Problem 3:6
//Replace "R" from Rahim with "F" from the given String:

public class replace {
    public static void main(String args[]){
        String s1 = "Ratul and Rahim lives in Rangpur";
        System.out.println("You entered this: " + s1);
        String replaceString = s1.replace('R', 'F');
        System.out.println("After replacing R your string is: " + replaceString);
    }
}
