package Object_Oriented_Programming.Abstraction.Interface.Types_Of_Interface.Functional_Interface;

import java.util.Scanner;

interface Payble{
    void pay();
}
class UPI implements Payble{
    public void pay(){
        System.out.println("Pay by using UPI");
    }
}
class NetBank implements Payble{
    public void pay(){
        System.out.println("Pay by using Net-Banking");
    }
}
class CreditCard implements Payble{
    public void pay(){
        System.out.println("Pay by using Credit Card");
    }
}

public class Demo {
    public static Payble getPayment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.UPI"+"\n"+"2.NetBank"+"\n"+"3.CreditCard");
        int n = sc.nextInt();
        if(n==1) return new UPI();
        else if(n==2) return new NetBank();
        else if(n==3) return new CreditCard();
        else
        {
            System.out.println("Invalid Input");
            return null;
        }
    }
    public static void main(String[] args) {
        Payble p = getPayment();
        p.pay(); //Lose Coupling
    }
    
}
