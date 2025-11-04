package Programming.Arrays.Basic_Array_Programs;

public class MaxElement {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int max=0;
        for(int n : a){
            if(n > max) max=n;
        }
        System.out.println(max);
    }
}
