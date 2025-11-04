package Object_Oriented_Programming.Basic_Topics.Constructor.Constructor_chain;

class Person{
    String name;
    Person(String n){
        name = n;
    }
}
class Teacher extends Person{
    String subject;
    Teacher (String n, String subject){
        super(n);
        this.subject = subject;
    }
}
public class Example {
    public static void main(String[] args) {
        Teacher t = new Teacher("Logitha", "Java");
        System.out.println(t.name);
        System.out.println(t.subject);
        
    }

}
