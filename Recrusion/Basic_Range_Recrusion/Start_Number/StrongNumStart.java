package Start_Number;

public class StrongNumStart {
    public static void main(String[] args) {
        range(1,3000);
    }
    public static void range(int start,int end)
    {
        if(start>end) return ;
        if(isS(start)) System.out.println(start);
        range( start+1, end);

    }
    public static boolean isS(int n)
    {
        return isStrong(n, n, 0);
    }
    public static boolean isStrong(int n,int m,int sum)
    {
        if(n==0) return m==sum;
        sum += fact(n%10);
        return isStrong(n/10, m,sum);

    }
    public static int fact(int n)
    {
        if(n==0) return 1;
        return n*fact(n-1);
    }
    
}
