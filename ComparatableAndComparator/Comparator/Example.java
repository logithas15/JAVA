package ComparatableAndComparator.Comparator;

import java.util.Arrays;
import java.util.Comparator;

class Emp {
    String name;
    double sal;

    public Emp(String name,double sal)
    {
        this.name=name;
        this.sal = sal;
    }
    @Override
    public String toString()
    {
        return "Emp[name: "+name+","+"sal: "+sal+"]";
    }
}
class SalComp implements Comparator
{
    public int compare(Object arg1,Object arg2)
    {
        Emp e1 = (Emp) arg1;
        Emp e2 = (Emp) arg2;
        if(e1.sal > e2.sal) return 1;
        if(e1.sal < e2.sal) return -1;
        return 0;
    } 
}
public class Example {
    public static void main(String[] args) {
        Emp[] a = {new Emp("Rama", 30000),new Emp("Sita", 25000),
        new Emp("Ravan", 10000),new Emp("Manju", 20000),
        new Emp("Sanju", 5000)  };
        
        Arrays.sort(a);
        for(Emp e : a)
        {
            System.out.println(e);
        }
    }
    
}
