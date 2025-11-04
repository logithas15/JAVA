package Programming.Arrays.Basic_Array_Programs;

import java.util.Arrays;

public class StartShifting {
    public static void main(String[] args) {
        int[] a = {1,0,5,0,3,0};
        int[] b = new int[a.length];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] != 0){
                b[count++] = a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
