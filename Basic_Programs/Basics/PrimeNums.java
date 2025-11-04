package Basics;
import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2;i<n/2;i++){
           if(n%i == 0) {
            flag = false;
            break;
           }
        }
        if(n>1 && flag){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
        
    }
    
}
