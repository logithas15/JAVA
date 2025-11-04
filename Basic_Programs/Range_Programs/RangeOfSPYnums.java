package Range_Programs;
import java.util.*;
public class RangeOfSPYnums {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

         for(int i=start;i<=end;i++){
            int num=i;
            int sum=0;
            int prod=1;

            while(num>0){
                sum += num%10;
                prod *= (num%10);
                num/=10;
            }
            if(sum==prod)
            System.out.println(i);
         }
        


        

    }
    
}

