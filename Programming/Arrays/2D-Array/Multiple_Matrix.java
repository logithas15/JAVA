import java.util.Arrays;

public class Multiple_Matrix {
    public static void main(String[] args) {
       int[][] a = {{1,2,1},{3,5,4},{2,3,1}};
       int[][] b = {{1,2,4},{4,2,1},{1,1,1}};
       int[][] c = new int[a.length][a.length];

       for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            for(int k=0;k<a[i].length;k++){
                c[i][j] += a[i][k] * b[k][j];
            }
        }
       }
       for(int[] n : c){
           System.out.println(Arrays.toString(n));
       }

    }
}
