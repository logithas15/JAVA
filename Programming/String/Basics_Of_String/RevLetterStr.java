package Programming.String.Basics_Of_String;

public class RevLetterStr {
    public static void main(String[] args) {
        String s = "java is easy";
        String res = "";
        int i = 0, j = 0;
        while(j<s.length()){
            while(j<s.length() && s.charAt(j) != ' ') j++;
            int k = j-1;
            while(k>=i){
                res += s.charAt(k);
                k--;
            }
            if(j<s.length()){
                res += " ";
            }
            j++;
            i=j;

        }
        System.out.println(res);

    }
    
}
