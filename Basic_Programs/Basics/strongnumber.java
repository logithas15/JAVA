package Basics;
import java.util.*;

public class strongnumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int num = n;
       int sum =0;
       
       while(n>0){
        int d = n%10;
        int fact = 1;
        for(int i = 1; i<= d; i++){
            fact *= i;
        }
        sum += fact;
        n/=10;
       }
       if(sum == num  )
       System.out.println("Strong Number");
       else
       System.out.println("Not a strong number");
    }
          
}
