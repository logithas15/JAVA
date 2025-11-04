package Pattern;
 
import java.util.*;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int stars = 1;
         
        for(int i=1;i<=n;i++){
           for(int j=1;j<=space;j++)
                System.out.print(" ");
            for(int j=1;j<=stars;j++)
                System.out.print("X");
              
            System.out.println();
            space--;
            stars += 2;
            }
            
        
        }
    }
    




