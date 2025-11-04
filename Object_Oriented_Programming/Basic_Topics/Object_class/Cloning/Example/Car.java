package Object_Oriented_Programming.Basic_Topics.Object_class.Cloning.Example;

public class Car implements Cloneable{
    String name;
    int number;
    String color;
    Engine e; //Has-a relationship

    public Car (String name, int number,String color,Engine e){
        this.name = name;
        this.number = number;
        this.color = color;
        this.e = e;
    }
    @Override
    public String toString(){
        return name+" "+number+" "+color+" "+e;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        //return super.clone(); -->Shallow Clone
        Car c = (Car) super.clone();
        c.e = (Engine) e.clone();
        return c;
    }
}
