package Programming.String.Basics_Of_String;

public class RevStr {
    public static void main(String[] args) {
        String s = "jspider";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);

    }
    
}
