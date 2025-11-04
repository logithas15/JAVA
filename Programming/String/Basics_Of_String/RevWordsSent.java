package Programming.String.Basics_Of_String;

public class RevWordsSent {
    public static void main(String[] args) {
        String s = "java is easy";
        String res="";
        int i = s.length()-1;
        int j = s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i) != ' ') i--;
            int k = i+1;
            while(k<=j){
                res += s.charAt(k);
                k++;
            }
            if(i>=0){
                res += " ";
            }
            i--;
            j=i;
        }
        System.out.println(res);

    }
    
}
