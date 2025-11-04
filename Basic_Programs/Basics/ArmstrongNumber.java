package Basics;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        n=num;
        int sum = 0;
        while(n>0){
            int d = n%10;
            int prod = 1;
            for(int i=1;i<=count;i++){
                prod = prod*d;
            }
            sum += prod;
            n/=10;
        }
        if(sum == num) 
        System.out.println("Armstrong Number");
        else 
        System.out.println("Not an Armstrong Number");
    }
    
}
