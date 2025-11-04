package Object_Oriented_Programming.Basic_Topics.Object_class.Equals_Method;

public class Person{
    String name;
    int age;
    String Kingdom;

    public Person(String name, int age,String Kingdom){
        this.name = name;
        this.age = age;
        this.Kingdom = Kingdom;
    }

    public String toString(){
        return "Name: "+name+"\n"+"Age: "+age+"\n"+"Kingdom: "+Kingdom;
    }
    public boolean equals(Object o){
        Person p = (Person) o;
        return this.name.equals(p.name) && this.age == p.age && this.Kingdom.equals(p.Kingdom);
    }
}
 
