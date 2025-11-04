package Programming.String.Basics_Of_String;

public class vowelsCount {
    public static void main(String[] args) {
        String s = "aireospace";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                count++;
            }
        System.out.println(count);

    }
}
