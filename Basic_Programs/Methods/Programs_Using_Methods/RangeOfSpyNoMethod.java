package Methods.Programs_Using_Methods;
public class RangeOfSpyNoMethod {

    public static void main(String[] args) {
        displayspy(1,25);
    }
    static void displayspy(int s, int e){
        for(int i=s;i<=e;i++){
            if(isspy(i)) {
                System.out.println(i);
            }

        }
    }
    static boolean isspy(int n){
        int sum=0;
        int prod=1;
        int temp=n;
        while (temp>0) {
            int d = temp%10;
            sum += d;
            prod *= d;
            temp/=10;
            
        }
        if(sum==prod){
            return true;
        }
        else{
            return false;
        }
    }
}