package Methods.Programs_Using_Methods;

public class threeprime {
    public static void main(String[] args) {
        range(1,100);
    }
    public static void range(int s,int e) {
        int c=0;
        for(int i=s;i<=e;i++){
            if(isPrime(i))
            {
               c++;
               if(c<=3){
                System.out.println(i);
               }
            }
        }
        
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;

        }
        return true;
    }
    
}
