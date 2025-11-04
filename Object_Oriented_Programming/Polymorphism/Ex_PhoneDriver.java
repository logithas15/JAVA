package Object_Oriented_Programming.Polymorphism;

@FunctionalInterface
interface Sim{
    void connect();
}
class Phone{
    Sim s;
    public Phone(Sim s){
        this.s = s;
    }
    public void call(){
        s.connect();
    }
}
class Airtel implements Sim{
    @Override
    public void connect(){
        System.out.println("Call connected by Airtel");
    }
}
class Jio implements Sim{
    @Override
    public void connect(){
        System.out.println("Call connected by Jio");
    }
}
class VI implements Sim{
    @Override
    public void connect(){
        System.out.println("Call connected by VI");
    }
}
public class Ex_PhoneDriver {
    public static void main(String[] args) {
        Phone p = new Phone(new Airtel());
        p.call();
    }
    
}
