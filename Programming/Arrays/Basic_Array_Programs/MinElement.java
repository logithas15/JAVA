package Programming.Arrays.Basic_Array_Programs;

public class MinElement {
    public static void main(String[] args) {
        int[] a = { 10,20,30,40};
        int min=a[0];
        for(int n : a){
            if(n < min) min=n;
        }
        System.out.println(min);
    }
}
