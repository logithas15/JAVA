package Programming.String.Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class phoneNumber {
    public static void main(String[] args) {
        String exp = "[6789][0-9]{9}";
        String s = "9876543210";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);
        
        if(m.matches())
        System.out.println("Valid Number");
        else System.out.println("Invalid Number");
    }
}
