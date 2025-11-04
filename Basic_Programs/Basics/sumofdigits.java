package Basics;
import java.util.*;
class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0){
            sum += n%10;
            n /= 10;
            if(n==0 && sum > 9){
                n = sum;
                sum = 0;

            }
        }
        System.out.println(sum);
    }
}