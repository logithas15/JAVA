package End_Number;
public class RecPalindromeend {

    public static void main(String[] args) {
        
       range(10,100); 
        
    }
    public static void range(int start,int end)
    {
        if(start>end) return ;
        if(isPalindrome(end)) {
            System.out.println(end);return;
        }
          range(start,end-1);
    }
    public static boolean isPalindrome(int n)
    {
        return isPalindromelogic(n, n, 0);
    } 
    public static boolean isPalindromelogic(int n,int temp, int rev)
    {
      if(n==0) return temp == rev;
      return isPalindromelogic(n/10,temp,(rev*10)+(n%10));
    }
}