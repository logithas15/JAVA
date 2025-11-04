package Basics;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1+2+3+4+5= 15
        //sum , store

        int sum = 0;
        String store = "";

        for(int i =1;i<=n;i++){
            sum += i;
            store += i;
            if (i>n) store += "+";
        }
        store += "=";
        store += sum;

    System.out.println(store);


    }
        
    
}
