package Object_Oriented_Programming.Abstraction.Interface;

import java.util.Scanner;

interface Bank{
    void RateOfInterest();

    default void CreditCard(){
        System.out.println("No-Credit Card");
    }
    static void IFSC(Object o){
        System.out.println(o.getClass().getSimpleName()+"IFSC CODE....");
    }
    private static void Info(){
        System.out.println("Bank-Info");
    }
}
class SBI implements Bank{
    public void RateOfInterest(){
        System.out.println("SBI - Bank");
    }

    public void CreditCard(){
        System.out.println("SBI - Credit Card");
    }
    
    public void yono(){
        System.out.println("SBI - Yono");
    }
}
class ICICI implements Bank{
    public void RateOfInterest(){
        System.out.println("ICICI - Bank");
    }

    public void CreditCard(){
        System.out.println("ICICI - Credit Card");
    }
    
    public void Imobile(){
        System.out.println("ICICI - imobile");
    }
}
class Axis implements Bank{
    public void RateOfInterest(){
        System.out.println("ICICI - Bank");
    }
}
public class Ex_BankDriver {
    public static Bank getBank(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.SBI"+"\n"+"2.ICICI"+"\n"+"3.Axis");
        int n = sc.nextInt();
        if(n==1) return new SBI();
        else if(n==2) return new ICICI();
         else if(n==3) return new Axis();
         else{
            System.out.println("Invalid Input");
            return null;
         }
        
    }
    public static void main(String[] args) {
        Bank b = getBank();
        b.RateOfInterest();
        b.CreditCard();
        if(b instanceof SBI) ((SBI)b).yono();
        else if(b instanceof ICICI) ((ICICI)b).Imobile();
        Bank.IFSC(b);

    }
    
}
