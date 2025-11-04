package Object_Oriented_Programming.Abstraction.Abstract_Class;

abstract class shape{
    String color;
    
    public shape(String color){
        this.color = color;
    }

    abstract public void getArea();
    public abstract void display();
}
class Rectangle extends shape{
    int length;
    int breadth;
    
    public Rectangle(String color,int length,int breadth){
        super(color);
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void getArea(){
        System.out.println(length*breadth);
    }
    @Override
    public void display(){
        System.out.println("Color: "+color);
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }
}
class Circle extends shape{
    int radius;
    
    public Circle(String color,int radius){
        super(color);
        this.radius = radius; 
    }
    @Override
    public void getArea(){
        double res = 3.14 * radius *radius;
        System.out.println(res);
    }
    @Override
    public void display(){
        System.out.println("Color: "+color);
        System.out.println("Radius: "+ radius); 
    }
}
public class Example {
    public static void main(String[] args) {
        shape s;
        s = new Rectangle("Red", 10, 20);
        s.getArea();
        s.display();
        s = new Circle("White",10);
        s.getArea();
        s.display();
    }
    
}
