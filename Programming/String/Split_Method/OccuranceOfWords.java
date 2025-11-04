package Programming.String.Split_Method;

public class OccuranceOfWords {
    public static void main(String[] args) {
        String s = "java is very very easy java";
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("")) continue;  
            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                    str[j] = "";  
                }
            }
            System.out.println(str[i] + " = " + count);
        }
    }
}
