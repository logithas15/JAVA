package End_Number;

public class SpyNumEnd {
    public static void main(String[] args) {
        range(1,140);
          
    }
    public static void range(int start, int end)
    {
        if(start > end) return ;
        if(isSpy(end)) 
        {
            System.out.println(end);return;
        }
        range(start, end-1);
    }
    public static boolean isSpy(int n)
    {
        return isSpylogic(n, 0, 1);
    }
    public static boolean isSpylogic(int n,int sum,int prod)
    {
        if(n==0) return sum == prod;
        sum += n%10;
        prod *= n%10;
        return isSpylogic(n/10, sum, prod);
    }
}
