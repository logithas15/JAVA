package Object_Oriented_Programming.Basic_Topics.Has_a_Relationship.Aggrigation.Example;

public class Phone {
    String name;
    String color;
    Sim s; //Has-a Relationship

    public Phone(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void insertSim(Sim s){
        this.s=s;
    }
    public void display(){
        System.out.println(name+"\n"+color);
        if(s != null) System.out.println(s.name+"\n"+s.number);
        else System.out.println("Sim card not added");
    }
    
}
