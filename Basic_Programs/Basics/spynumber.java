package Basics;
import java.util.*;

public class spynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while(n>0){
            sum += n%10;
            prod *= (n%10);
            n/=10;

        }
        if(sum == prod){
            System.out.println("spy");
        }
        else{
            System.out.println("not a spy");
        }
    }
}
