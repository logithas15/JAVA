package Recrusion.Alternate_Recrusion;

public class prime {

    public static void main(String[] args) {
        range(1,100,0);
    }
    public static void range(int st, int end,int count)
    {
        if(st>end) return;
        if(isP(st)) 
        {
           count++;
           if(count%2 != 0){
            System.out.println(st);
           }
        }
        range(st+1, end,count);
    }
    public static boolean isP(int n)
    {
        return isPrime(n, n/2);
    }
    public static boolean isPrime(int n,int i)
    {
        if(i==1) return true;
        if(n<=1 || n%i==0) return false;
        return isPrime(n, i-1);
    }

}