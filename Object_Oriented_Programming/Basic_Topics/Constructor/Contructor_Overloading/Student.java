package Object_Oriented_Programming.Basic_Topics.Constructor.Contructor_Overloading;

public class Student {
    String name;
    int age;
    int ID;

    Student(){}

    Student(String name){
        this.name = name;
    }

    Student(String name , int age, int ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student ID: "+ID);

    }
    public static void main(String[] args) {
        Student s1 = new Student("Ramesh");
        s1.display();
        Student s2 = new Student("Ramesh",23,1);
        s2.display();
    }
}
