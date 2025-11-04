package Start_Number;

public class PerfectStart {
    public static void main(String[] args) {
        range(1,100);
        
    }
    public static void range(int start,int end)
    {
        if(start > end) return ;
        if(isPerfectrange(start)) System.out.println(start);
        range(start+1,end);
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
