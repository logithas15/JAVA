package Programming.String.Basics_Of_String;

public class Helloworld {
    public static void main(String[] args) {
        String s = "ramana kumar";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            char count='1';
            if(ch[i] >= '0' && ch[i] <= '9') continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    count++;
                    ch[j] = count;
                }
             
            }
             
            if(count > '1'){
                 ch[i] = '1';
            }
        }
        System.out.println(ch);
    }
    
}
