public class MaxValue_2D {
    public static void main(String[] args) {
        int[][] a = {{1,2,4},{3,4,88}};
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j] > max) max = a[i][j];
            }
        }
        System.out.println(max);
    }
}
