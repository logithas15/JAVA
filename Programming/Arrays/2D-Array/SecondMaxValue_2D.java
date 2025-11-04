public class SecondMaxValue_2D {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{6,7,8}};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j] > max1) {
                    max2 = max1;
                    max1 = a[i][j];
                }
                else if(a[i][j] > max2 && a[i][j] != max1) {
                    max2 = a[i][j];
                }
            }
        }
        System.out.println("Second Maximum value: "+max2);
    }
}