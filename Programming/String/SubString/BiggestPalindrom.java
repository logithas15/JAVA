package Programming.String.SubString;

public class BiggestPalindrom {
    public static void main(String[] args) {
        String s = "malayalam";
        String biggestPalindrom="";
        for(int i=0;i<s.length();i++){
            for(int j=i+3;j<s.length();j++){
                String str = s.substring(i,j);
                if(isPalindrome(str))
                //System.out.println(str);
                if(str.length() > biggestPalindrom.length())
                    biggestPalindrom = str;
                
            }
        }
        System.out.println(biggestPalindrom);
    } 
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
}
