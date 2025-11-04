package Framework.Collection_Framework.Set.LinkedHashSet;

import java.util.Set;
import java.util.LinkedHashSet;
 

public class Demo {
    public static void main(String[] args) {
        Set<String> s = new  LinkedHashSet<String>();
        s.add("Java");
        s.add("HTML");
        s.add("SQL");
        s.add("Python");

        System.out.println(s);
        
    }
}
