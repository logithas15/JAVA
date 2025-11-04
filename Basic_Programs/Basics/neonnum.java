package Basics;

public class neonnum {
    public static void main(String[] args) {
        int n = 10;
        int sq=n*n;//81
        int sum =0;
        while(sq>0){
            int d = sq%10;//1//8
            sum += d;//1+8
            sq/=10;//8//0

        }
        if(sum == n){
            System.out.println("neon");
        }
        else
    {
        System.out.println("not");
    }
    }
    
}
