package Programming.String.Basics_Of_String;

public class ArrangeChar {
    public static void main(String[] args) {
        String s = "JspiderS#123";
        String uppercase = "", lowercase="" , number="", specialchar="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z') uppercase += ch;
            else if(ch >= 'a' && ch <= 'z') lowercase += ch;
            else if(ch >= '0' && ch <= '9') number += ch;
            else{
                specialchar += ch;
            }
            
        }
        String res = number+specialchar+lowercase+uppercase;
        System.out.println(res);
    }
}
