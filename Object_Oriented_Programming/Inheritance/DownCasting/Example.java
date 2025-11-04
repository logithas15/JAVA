package Object_Oriented_Programming.Inheritance.DownCasting;

import java.util.Scanner;

class Vehicle{
    public void start(){}
    public void accelarate(){}
    public void stop(){}
}
class BMW extends Vehicle{
    @Override
    public void start(){
        System.out.println("BMW - Start");
    }
    @Override
    public void accelarate(){
        System.out.println("BMW - Accelarate");
    }
    @Override
    public void stop(){
        System.out.println("BMW - Stop");
    }
    public void Autopilot(){
        System.out.println("BMW - Autopilot");
    }
}
class Audi extends Vehicle{
    @Override
    public void start(){
        System.out.println("Audi - Start");
    }
    @Override
    public void accelarate(){
        System.out.println("Audi - Accelarate");
    }
    @Override
    public void stop(){
        System.out.println("Audi - Stop");
    }
    public void ABS(){
        System.out.println("Audi - ABS");
    }
}
class BenZ extends Vehicle{
    @Override
    public void start(){
        System.out.println("Benz - Start");
    }
    @Override
    public void accelarate(){
        System.out.println("Benz - Accelarate");
    }
    @Override
    public void stop(){
        System.out.println("Benz - Stop");
    }
    public void GPS(){
        System.out.println("Benz - GPS");
    }
}
public class Example {
    public static void Driver (Vehicle v){
        v.start();
        v.accelarate();
        v.stop();
        if(v instanceof BMW) ((BMW)v).Autopilot();
        else if (v instanceof BenZ) ((BenZ)v).GPS();
        else if (v instanceof Audi) ((Audi)v).ABS();
    }
    public static Vehicle getCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.BMW"+"\n"+"2.Audi"+"\n"+"3.BenZ");
        int n = sc.nextInt();
        if(n==1) return new BMW();
        else if(n==2) return new Audi();
        else if(n==3) return new BenZ();
        else{
            System.out.println("Invalid Input");
            return null;
        }
    }
    public static void main(String[] args) {
        Driver(getCar());
    }
    
}
