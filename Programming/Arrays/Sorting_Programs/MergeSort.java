package Programming.Arrays.Sorting_Programs;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {7,6,5,4,8,4,2,5};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    //Dividing Part
    public static void sort(int[] a){
        if(a.length == 1) return;  //Base condition
        int[] left = new int[a.length/2];
        int[] right = new int[a.length - left.length];

        for(int i=0;i<left.length;i++) left[i] = a[i];
        for(int j=0;j<right.length;j++) right[j] = a[j+left.length];
        sort(left);
        sort(right);
        Merge(left,right,a);
    }
    //Merge Part
    public static void Merge(int[] a, int[] b,int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        //if a element leftout
        while(i<a.length) c[k++] = a[i++];
        //if b element leftout
        while(j<b.length) c[k++] = b[j++];
    }
}
