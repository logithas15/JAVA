package Object_Oriented_Programming.Basic_Topics.Has_a_Relationship.Composition.Example;

public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("BMW",11, "Black", new Engine(1000));
        //c1.cc = 2000 -->CTE
        c1.e.cc = 2000;
        c1.display();
    }
}
