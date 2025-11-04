package Programming.Arrays.Basic_Array_Programs;

public class SecondMinElement {
    public static void main(String[] args) {
        int[] a = {10,2,30,2,4,5};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i] < min1){
                min2 = min1;
                min1 = a[i];
            }
            else if(a[i] < min2 && a[i] != min1){
                min2 = a[i];
            }
        }
        System.out.println(min2);
    }
}
