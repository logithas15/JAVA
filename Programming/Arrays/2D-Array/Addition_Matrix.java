import java.util.Arrays;

public class Addition_Matrix{
    public static void main(String[] args) {
        int[][] a = {{1,3,5},{9,2,1}};
        int[][] b = {{2,1,2},{3,5,1}};
        int[][] c = new int[3][2];

        for(int i = 0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int[] n : c){
            System.out.println(Arrays.toString(n));
        }
    }
}

