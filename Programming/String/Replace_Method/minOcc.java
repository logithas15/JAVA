package Programming.String.Replace_Method;

public class minOcc {
    public static void main(String[] args) {
        String s1 = "javadev";
        String s2="";
        int mincount=s1.length();
        char minchar=' ';
        while(s1.length()>0)
        {
            char ch = s1.charAt(0);
            s2=s1.replace(ch+"","");
            int count = s1.length() - s2.length();
            if(count < mincount){
                minchar= ch;
                mincount=count;
            }
            s1=s2;

        }
        System.out.println(minchar+"="+mincount);


    }
    
}
