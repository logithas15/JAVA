package Basics;

public class automorphic {

    public static void main(String[] args) {
        int n=12;
        int sq = n*n;
        boolean flag = true;
        while(n>0){
            if(n%10 != sq%10){
                flag = false;
                break;
            
            }
            n/=10;
            sq/=10;
        }
            if(flag){
                System.out.println("automorphic number");
            }
            else{
                System.out.println(" Not an automorphic number");
            }
        }
    }
