package Basics;
import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int dec = 0;
        int prod = 1;
    while(bin>0){
        int bit = bin%10;
        dec += (bit*prod);
        prod = prod*2;
        bin /= 10;
    }
    System.out.println("Decimal is: "+dec);
    }
    
}
