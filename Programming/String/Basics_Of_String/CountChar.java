package Programming.String.Basics_Of_String;
public class CountChar {
    public static void main(String[] args) {
        String s = "JspiderS#123";
        int uppercase = 0, lowercase = 0, number=0, specialchar = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z') uppercase++;
            else if(ch >= 'a' && ch <= 'z') lowercase++;
            else if(ch >= '0' && ch <= '9') number++;
            else{
                specialchar++;
            }

        }
        System.out.println("Uppercase: "+uppercase);
        System.out.println("Lowercase: "+lowercase);
        System.out.println("Numbers: "+number);
        System.out.println("Special Character: "+specialchar);
    }
    
}
