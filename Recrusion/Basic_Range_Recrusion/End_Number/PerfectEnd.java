package End_Number;

public class PerfectEnd{
    public static void main(String[] args) {
        range(1,100);
        
    }
    public static void range(int start,int end)
    {
        if(start > end) return ;
        if(isPerfectrange(end)) {System.out.println(end); return;}
         range(start,end-1);
    }
    public static boolean isPerfectrange(int n)
    {
        return isPerfect(n,1,0);
    }
    public static boolean isPerfect(int n, int i,int sum)
    {
        if(i>n/2) return n==sum;
        if(n%i==0) sum += i;
        return isPerfect(n,i+1,sum); 

    }

    
}
