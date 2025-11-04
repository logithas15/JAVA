package Start_Number;

public class SpyNumStart {
    public static void main(String[] args) {
        range(1,140);
    }
    public static int range(int start, int end)
    {
        if(start > end) return 0;
        if(isSpy(start)) System.out.println(start);
        return range(start+1, end);
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
