package Range_Programs;
 import java.util.*;
public class RangeOfPerfectNums {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i=start;i<=end;i++){
            int num=i;
            int sum=0;
            for(int j=1;j<=i/2;j++){
                if(num % j == 0){
                    sum += j;
                }

            }
            if(sum == num){
                System.out.println(i);
            }
        }

        

    }
    
}

