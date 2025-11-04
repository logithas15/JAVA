package Programming.String.Basics_Of_String;

public class order {
    public static void main(String[] args) {
        String s = "javadev";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i] > ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println(ch);
    }
    
}
