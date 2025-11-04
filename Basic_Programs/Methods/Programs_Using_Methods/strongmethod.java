package Methods.Programs_Using_Methods;

public class strongmethod {
    public static void main(String[] args) {
        range(1,150);
    }
    public static void range(int s,int e){
        for(int i = s;i<=e;i++){
            if(isStrong(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isStrong(int n){
        int sum =0;
        int temp = n;
        while(n>0){
            int d=n%10;
            int fact=1;
            for(int i=1;i<=d;i++){
               fact *= i; 
            }
            sum += fact;
            n/=10;
        }
        return sum == temp;
    }
}
