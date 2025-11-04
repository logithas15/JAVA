package Object_Oriented_Programming.Basic_Topics.Object_class.toString_Method;

class Pen{
    String brand;
    String color;
    Double price;

    public Pen(String brand,String color, Double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Brand: "+brand+"\n"+"Color: "+color+"\n"+"Price: "+price ;
    }

}
public class Example {
    public static void main(String[] args) {
        Pen p = new Pen("Cello","Blue",10.0);
        System.out.println(p);
    }
}
