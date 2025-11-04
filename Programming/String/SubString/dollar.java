package Programming.String.SubString;

public class dollar {
    public static void main(String[] args) {
        String s = "Bossss";
         
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
             
            if(ch[i] >= 'A' && ch[i] <= 'Z') ch[i] += 32;
            if(i<ch.length - 1 && ch[i] == ch[i+1]) {
                ch[i+1] = '$';
            }
        }
        System.out.println(ch);
         
    }
    
}
