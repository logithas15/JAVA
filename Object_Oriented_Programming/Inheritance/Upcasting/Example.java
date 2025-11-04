package Object_Oriented_Programming.Inheritance.Upcasting;

class A{
    void m1(){
        System.out.println("m1()-A class");
    }
}
class B extends A{
    void m2(){
        System.out.println("m2()-B class");
    }
}
class C extends A{
    void m3(){
        System.out.println("m3()-C class");
    }
}
public class Example {
    public static void main(String[] args) {
        B b1 = new B();
        b1.m1();
        b1.m2();

        A a1 = b1; //Upcasting
        a1.m1();
        //a1.m2(); --> CTE

        C c1 = new C();
        c1.m1();
        c1.m3();

        A a2 = c1; //Upcasting
        a2.m1();
        //a2.m3(); -->CTE
    }
    
}
