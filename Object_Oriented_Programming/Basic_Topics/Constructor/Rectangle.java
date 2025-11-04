package Object_Oriented_Programming.Basic_Topics.Constructor;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void getArea(){
        System.out.println(length*breadth);
    }
    public void getPerimeter(){
        int res = 2*(length+breadth);
        System.out.println(res);
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        r.getArea();
        r.getPerimeter();
    }
}
