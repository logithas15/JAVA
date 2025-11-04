package Basics;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        int bin = 0;
        int i = 1;
    while(dec > 0){
        int bit = dec%2;
        bin = bit*i+bin;
        i *= 10;
        dec /= 2; 
    }
    System.out.println("Binary is: "+bin);
    }
}