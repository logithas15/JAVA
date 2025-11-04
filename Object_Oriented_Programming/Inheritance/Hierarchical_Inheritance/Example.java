package Object_Oriented_Programming.Inheritance.Hierarchical_Inheritance;

class Card{
    String name;
    long CardNum;
    String expiryDate;

    public void swipe(){
        System.out.println("Card Swipping");
    }
}
class CreditCard extends Card{
    int cvv;
    long CardLimit;

    public void pay(){
        System.out.println("Pay by using CreditCard");
    }
    public void details(){
        System.out.println("Card Name: "+name);
        System.out.println("Card Number: "+CardNum);
        System.out.println("Expiry Date: "+expiryDate);
        System.out.println("CVV: "+cvv);
        System.out.println("Card Limit: "+ CardLimit);
    }
}
class DebitCard extends Card{
    int bal;
}
public class Example {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        c.name="Visa";
        c.CardNum = 12345678;
        c.expiryDate = "12/35";
        c.cvv = 1000;
        c.CardLimit = 50000;

        c.swipe();
        c.pay();
        c.details();
    }
}
