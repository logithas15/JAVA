package Object_Oriented_Programming.Basic_Topics.Object_class.Equals_Method;

public class GameOfThrone {
    public static void main(String[] args) {
        Person p1 = new Person("Tyrion",30,"Kingsland");
        Person p2 = new Person("Tyrion",34,"Kingsland");
        System.out.println(p1.equals(p2));
    }
}
