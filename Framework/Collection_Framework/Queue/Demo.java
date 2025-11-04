package Framework.Collection_Framework.Queue;

import java.util.Queue;
import java.util.ArrayDeque;
 


 

public class Demo {
    public static void main(String[] args) {
        Queue q = new ArrayDeque<>();
        q.add(40);
        q.add(30);
        q.add(20);
        q.add(10);

        while(!q.isEmpty())
        {
            System.out.println(q.poll());
        }
        
    }
}
