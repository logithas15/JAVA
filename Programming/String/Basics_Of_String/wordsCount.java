package Programming.String.Basics_Of_String;

public class wordsCount {
    public static void main(String[] args) {
         
        String s = "java is easy easy";
        int count = 0;
        int i = 0;

        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;  
            }
            if (i < s.length()) {
                count++;  
                while (i < s.length() && s.charAt(i) != ' ') {
                    i++; 
                }
            }
        }
        System.out.println("Words: " + count);
    }
}

        
    
    
