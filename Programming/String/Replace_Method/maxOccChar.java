package Programming.String.Replace_Method;

public class maxOccChar {
    public static void main(String[] args) {
        String s1= "javadev";
        String s2 = "";
        char maxChar=' ';
        int maxCount=0;
        while(s1.length()>0){
            char ch = s1.charAt(0);
            s2=s1.replace(ch+"","");
            int count = s1.length()-s2.length();
            if(count > maxCount){
                maxCount=count;
                maxChar = ch;
            }
            s1=s2;
        }
        System.out.println(maxChar+"="+maxCount);
    }
    
}
