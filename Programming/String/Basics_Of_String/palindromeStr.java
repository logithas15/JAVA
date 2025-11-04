package Programming.String.Basics_Of_String;

public class palindromeStr {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
    public static boolean isPalindrome(String s){

        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;

        }
        return true;
         
    }
    }
    

