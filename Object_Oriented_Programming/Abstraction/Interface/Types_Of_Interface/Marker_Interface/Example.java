package Object_Oriented_Programming.Abstraction.Interface.Types_Of_Interface.Marker_Interface;

interface Washable{

}
class Car implements Washable{}
class Laptop {}
class Bike implements Washable{}
class Mobile{}

public class Example {
    public static void Wash (Object o) {
        if(o instanceof Washable)
        System.out.println(o.getClass().getSimpleName()+" is washed");
        else 
        System.out.println(o.getClass().getSimpleName()+" is not Washable");
    }
    public static void main(String[] args) {
        Wash(new Bike());
        Wash(new Laptop());
    }
}
