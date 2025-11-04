package Programming.String.SubString;

public class matchingKey {
    public static void main(String[] args) {
        String s = "ababa";
        String key="aba";
        int count=0;
        for(int i=0;i<s.length()-key.length();i++){
            if(s.substring(i,i+key.length()).equals(key)) 
            count++;
        }
        System.out.println(count);
    }
    
}
