import java.util.Arrays;

class Circle
{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public String toString()
    {
        return "Circle radius: "+radius;
    }
    //Natural Ordering according to radius
    public int compareTo(Object arg)
    {
        return radius-((Circle)arg).radius;
    }
  
}
public class Example
{
    public static void main(String[] args) {
        Circle[] a = {new Circle(30),new Circle(40),new Circle(10),new Circle(20)};
        Arrays.sort(a);
        for(Circle c : a)
        {
            System.out.println(c);
        }
    }
}