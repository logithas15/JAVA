package Framework.Collection_Framework.Interface.Iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        Iterator<Integer> i = s.iterator();
        while(i.hasNext())
        {
           System.out.println(i.next());
        }
    }
}
