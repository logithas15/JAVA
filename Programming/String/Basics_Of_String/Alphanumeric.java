package Programming.String.Basics_Of_String;

public class Alphanumeric {
    public static void main(String[] args) {
        String s = "Logi@15";
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') 
                sum += ch-'0';
              //sum += Integer.parseInt(ch+" ");
        }
        System.out.println(sum);
    }
}
