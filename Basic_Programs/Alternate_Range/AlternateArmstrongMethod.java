package Alternate_Range;

public class AlternateArmstrongMethod {

    public static void main(String[] args) {
        displayarms(1,200);
    }
    static void displayarms(int s, int e)
    {
        for(int i=s;i<=e;i++){
            if(isarms(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isarms(int n)
    {
        int digit =0;
        int temp=n;
        while(temp>0){
            digit++;
            temp/=10;
        }
        temp=n;
        int sum=0;
        while (temp>0){
            int d=temp%10;
            int pow=1;
            for(int j=1;j<=digit;j++){
                pow = d*pow;
            }
            sum += pow;
            temp/=10;
        }
        if(sum == n)
        return true;
        else
        return false;

    }
}
