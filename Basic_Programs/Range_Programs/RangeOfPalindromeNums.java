package Range_Programs;
import java.util.*;
public class RangeOfPalindromeNums {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        
        

        for(int i=start;i<=end;i++){
            int num=i;
            int rev=0;

            while(num>0){
                int rem = num%10;
                rev = (rev*10)+rem;
                num/=10;
            }
            if(rev == i){
                System.out.println(i);
            }
        }
    }
    
}

