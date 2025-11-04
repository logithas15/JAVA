package Programming.String.Basics_Of_String;

public class LoToUp {
    public static void main(String[] args) {
        String s = "aBcDeF";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z') ch[i] += 32;
            else if(ch[i] >= 'a' && ch[i] <= 'z') ch[i] -= 32;
        }
        System.out.println(ch);
    }
    
}
