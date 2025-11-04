package Range_Programs;
 import java.util.*;
public class RangeOfStrongNums {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i=start ; i<=end ;i++){
            int sum=0;
            int num=i;
            int temp=num;

            while(num>0){
                int d=num%10;
                int fact=1;
                
                for(int j=1;j<=d;j++){
                   fact *= j;
                }
                sum += fact;
                num/=10;
            }
            if(sum == temp){
                System.out.println(i);
            }

        }

        

    }
    
}

