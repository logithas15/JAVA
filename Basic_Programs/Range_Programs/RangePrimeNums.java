package Range_Programs;
import java.util.*;
public class RangePrimeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i = end ;i >= start;i--){
            if(i<=1) continue;
            boolean flag = true;
            for(int j = 2;j<=i/2;j++){
                if(i%j==0){
                flag = false;
                break;
                }
            }
            if(flag){
                System.out.println("Largest Prime Number: "+i);
                break;
            }
        }
    }
    
}
