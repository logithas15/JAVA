package Start_Number;

public class RecPalindromeStart {
    public static void main(String[] args) {
          range(10,100); 
    }

    public static void range(int start, int end)
    {
        if(start > end) return;
        if(isPalind(start)) System.out.println(start);
        range(start + 1, end);
    }
    public static boolean isPalind(int n)
    {
        return isPalindrome(n, n, 0);
    }
    public static boolean isPalindrome(int n, int temp,int rev)
    {
        if(n==0) return temp==rev;
        return isPalindrome(n/10, temp, (rev*10)+(n%10));
    }
}

