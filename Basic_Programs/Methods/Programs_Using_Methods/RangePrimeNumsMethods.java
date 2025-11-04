package Methods.Programs_Using_Methods;
public class RangePrimeNumsMethods {
    public static void main(String[] args) {
        displayPrimeNums(1,25);
    }
    static void displayPrimeNums(int s,int e)
    {
        for(int i=s;i<=e;i++){
          if(isPrime(i)){
             System.out.println(i);
          }
        }
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    
}
