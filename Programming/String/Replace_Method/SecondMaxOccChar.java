package Programming.String.Replace_Method;

public class SecondMaxOccChar {
    public static void main(String[] args) {
        String s1 = "javadev";
        String s2 = "";
        int seccount=0;
        char secchar=' ';
        int maxcount=0;
        char maxchar=' ';

        while(s1.length()>0){
            char ch = s1.charAt(0);
            s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            if(count > maxcount){
                
                maxchar=ch;
                maxcount=count;
                seccount=maxcount;
                secchar=maxchar;
            }
            else if(count > seccount && ch != maxchar){
                secchar = ch;
                seccount = count; 
            }
        s1=s2;

        }
        System.out.println(secchar+"="+seccount);

    }
}
