package Programming.String.Regular_Expression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class gmail {
    public static void main(String[] args) {
        String exp = "[a-z][a-z0-9]+@gmail[.]com";
        String s = "logithas15@gmail.com";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        if(m.matches()) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}
