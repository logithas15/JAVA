package Object_Oriented_Programming.Basic_Topics.Object_class.Cloning.Example;

public class CarDriver {
    public static void main(String[] args) throws CloneNotSupportedException{
        Car c1 = new Car("BMW",15,"Black",new Engine(1000));
        Car c2 = (Car) c1.clone();
        c2.e.cc = 2000;
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
