package Programming.Arrays.Basic_Array_Programs;

public class NumberToString {
    public static void main(String[] args) {
        int n = 98765432;
        convert(n/10000000,"Crore");
        convert((n/100000)%100,"Lakhs");
        convert((n/1000)%100,"Thousand");
        convert((n/100)%100,"Hundred");
        convert(n%100,"");
    }
    public static void convert(int n, String s){
        String[] one = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
                    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] two = {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if(n <= 19) System.out.println(one[n]+"");
        else System.out.println(two[n/10]+" "+one[n%10]+" ");

        if(n != 0) System.out.println(s);
    }
}
