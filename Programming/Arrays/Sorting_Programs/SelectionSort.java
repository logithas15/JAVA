package Programming.Arrays.Sorting_Programs;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {4,3,2,1,0};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[] a){
        for(int i=0;i<a.length;i++){
            int smallIndex = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j] < a[smallIndex]){
                    smallIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallIndex];
            a[smallIndex] = temp;
        }
    }
    
}
