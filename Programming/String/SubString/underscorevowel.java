package Programming.String.SubString;

public class underscorevowel {
    public static void main(String[] args) {
        String s = "javadev";
        String res = "";
        char[] ch = s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z') ch[i]+=32;
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') count++;
            
        }
        if(count >= 3) {
            for(int i=0;i<s.length();i++){
                if(!(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'))
                res += ch[i]+" ";

            }
        }
        System.out.println(res);
    }
    
}
