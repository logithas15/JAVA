package Programming.String.Replace_Method;

public class SecondMinOccChar {
    public static void main(String[] args) {
        String s1 = "javadev";
        String s2 = "";
        int mincount = s1.length() + 1;
        int seccount = s1.length() + 1;
        char minchar = ' ';
        char secchar = ' ';

        while (s1.length() > 0) {
            char ch = s1.charAt(0);
            s2 = s1.replace(ch + "", "");
            int count = s1.length() - s2.length();

            if (count < mincount) {
                
                mincount = count;
                minchar = ch;
                seccount = mincount;
                secchar = minchar;
            } else if (count < seccount && ch != minchar) {
                seccount = count;
                secchar = ch;
            }

            s1 = s2;
        }

        System.out.println("Second Minimum: " + secchar + "=" + seccount);
    }
}
