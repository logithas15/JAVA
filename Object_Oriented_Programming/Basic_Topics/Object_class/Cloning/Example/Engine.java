package Object_Oriented_Programming.Basic_Topics.Object_class.Cloning.Example;

public class Engine implements Cloneable {
    int cc;
    public Engine (int cc){
        this.cc = cc;
    }
    @Override
    public String toString(){
        return "Engine cc is: "+cc;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
