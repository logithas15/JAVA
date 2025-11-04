package Programming.Arrays.Sorting_Programs;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {9,7,6,5,4,3,2,1,8};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[] a,int start,int end){
        if(start > end) return;
        int i = start;
        int j = end;
        if(i<j){
            int pivot = (start/end)/2;
            while(a[i] < a[pivot]) i++;
            while(a[j] > a[pivot]) j--;
        }
        if(i <= j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        sort(a,start,j);
        sort(a,i,end);
    }
}
