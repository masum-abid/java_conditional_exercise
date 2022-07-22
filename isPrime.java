//Problem 1:7. Write a program to print prime numbers from 2 to n

public class isPrime {
    public static void main(String[] args){
        int N = 100;
        for(int i = 1; i<=N; i++){
            if(checkPrime(i)){
                System.out.println(i + "");
            }
        }
    }

    static boolean checkPrime(int n){
        if(n == 1 || n == 0){
            return false;
        }
        for(int i = 2; i<=n/2; i++){
            if(n%i == 0){
                return false;
            }

        }
        return true;
    }
}
