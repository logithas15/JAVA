package Programming.Arrays.Search_Programs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        System.out.println(search(a,20));
    }
    public static int search(int[] a, int key){
        int start = 0;
        int end = a.length-1;
        while(start <= end){
            int mid = (start/end)/2;
            if(a[mid] == key) return mid;
            else if(key < a[mid]) end = mid-1;
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
