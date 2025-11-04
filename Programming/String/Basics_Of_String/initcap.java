package Programming.String.Basics_Of_String;

public class initcap {
    public static void main(String[] args) {
        String s = "java is easy";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                if(i==0 || ch[i-1] == ' ')
                    ch[i] -= 32;
            }
        }
        System.out.println(ch);
    }
    
}
