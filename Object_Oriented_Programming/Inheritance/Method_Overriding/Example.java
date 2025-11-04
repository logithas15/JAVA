package Object_Oriented_Programming.Inheritance.Method_Overriding;

class Animal{
    void move(){
        System.out.println("Running");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barking");
    }
}
class snake extends Animal{
    @Override
    void move(){
        System.out.println("crawling");
    }
}
public class Example {
    public static void main(String[] args) {
        snake s = new snake();
        s.move();

    }
}
