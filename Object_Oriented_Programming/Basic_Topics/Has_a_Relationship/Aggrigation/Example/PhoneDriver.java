package Object_Oriented_Programming.Basic_Topics.Has_a_Relationship.Aggrigation.Example;

public class PhoneDriver {
    public static void main(String[] args) {
        Phone p = new Phone("Nothing","White");
        p.insertSim(new Sim("Jio", 630976543));
        p.display();
    }
}
