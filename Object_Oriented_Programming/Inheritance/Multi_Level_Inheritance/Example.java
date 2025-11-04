package Object_Oriented_Programming.Inheritance.Multi_Level_Inheritance;

class Animal {
    void eat(){
        System.out.println("Animal-Eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Bow Bow");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping...");
    }
}
public class Example {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.eat();
        d.bark();
        BabyDog b = new BabyDog();
        b.eat();
        b.bark();
        b.weep();

    }
    
}
