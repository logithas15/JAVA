package Object_Oriented_Programming.Inheritance.super_Keyword;

class A{
    int i;
    int j;
    A(int i,int j){
        this.i = i;
        this.j = j;
    }
}
class B extends A{
    int k;
    int l;
    B(int i,int j,int k,int l){
        super(i,j);
        this.k=k;
        this.l=l;
    }
}

public class Example {
    public static void main(String[] args) {
        B b1 = new B(10,20,30,40);
        System.out.println(b1.i+" "+b1.j+" "+b1.k+" "+b1.l);
    }   
}