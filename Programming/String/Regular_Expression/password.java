package Programming.String.Regular_Expression;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class password {
    public static void main(String[] args) {
        String exp = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^A-Z0-9a-z]).{4,10}";
        String s = "Logitha@15";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        if(m.matches()) System.out.println("Valid");
        else System.out.println("Invalid");

    }
    
}
