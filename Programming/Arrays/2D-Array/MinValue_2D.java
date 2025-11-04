public class MinValue_2D {
    public static void main(String[] args) {
        int[][] a = {{1,2,4},{4,3,5}};
        int min = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j] < min) min = a[i][j];
            }
        }
        System.out.println(min);
    }
}
