package Framework.Collection_Framework.Interface.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        ListIterator li = l.listIterator();
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }
        
    }
}
