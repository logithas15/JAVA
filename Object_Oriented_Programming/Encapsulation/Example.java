package Object_Oriented_Programming.Encapsulation;

class A{
    private int i;
    private int j;

    public A(int i,int j){
        this.i = i;
        this.j = j;
    }
    public int getI(){
        return i;
    }
    public int getJ(){
        return j;
    }
    public void setI(int i){
        this.i = i;
    }
    public void setJ(int j){
        this.j = j;
    }
}
public class Example {
    public static void main(String[] args) {
        A a = new A(10,20);
        System.out.println(a.getI() +"\n"+a.getJ());
        a.setI(90);
        a.setJ(100);
        System.out.println(a.getI()+"\n"+a.getJ());
    }
}
