package Range_Programs;
import java.util.*;
public class RangeOfArmstrongNums {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i = start ;i<=end; i++){
            int num = i;
            int sum = 0;
            int digit = 0;
            int temp= num;

            while(num>0){
                digit++;
                num/=10;
            }
            num=temp;
            while (num>0) {
                int d = num%10;
                int pow = 1;
                for(int j=1;j<=digit;j++){
                    pow = d*pow;
                }
                sum+=pow;
                num/=10;
            }
            if(sum==temp){
                System.out.println(i);
            }
        }
        


        

    }
    
}
