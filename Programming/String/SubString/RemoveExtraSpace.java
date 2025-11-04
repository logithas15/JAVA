package Programming.String.SubString;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String s = "  java is    easy";
        String res = "";
        boolean space = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                res += s.charAt(i);
                space = false;
            }
            else if(!space){
                res += ' ';
                space = true;            
            }
        }
        System.out.println(res.trim());
    }
    
}
