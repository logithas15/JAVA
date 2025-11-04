package Object_Oriented_Programming.Basic_Topics.Has_a_Relationship.Composition.Example;

public class Car {

    String name;
    int carNum;
    String color;
    Engine e; //Has-a Relationship

    public Car(String name,int carNum,String color, Engine e){
        this.name = name;
        this.carNum = carNum;
        this.color = color;
        this.e = e; //Composition
    }
    public void display(){
        System.out.println(name+"\n"+carNum+"\n"+color+"\n"+e.cc);
    }
}