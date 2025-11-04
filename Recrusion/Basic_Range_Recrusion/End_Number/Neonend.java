package End_Number;

public class Neonend {
    public static void main(String[] args) {
        range(1,100);
    }
    public static void range(int start,int end){
        if(start > end) return ;
        if(isNeon(end)) {
            System.out.println(end); return;
        }
        range(start,end-1);

    }
    public static boolean isNeon(int n)
    {
        return isNeonlo(n, n*n, 0);
    }
    public static boolean isNeonlo(int n, int sq,int sum)
    {
        if(sq == 0) return n==sum;
        return isNeonlo(n, sq/10, sum+(sq%10));
    }
    
}
