package Data_Structure.Queue.QueueUsingLinkedList;

class QueueLinkedList  {
    private Node first = null;
    private Node last = null;
    private int count = 0;
    
    //add
    public void add(Object e)
    {
        if(first == null)
        {
            first = new Node(e,null);
            last = first;
            count++;
            return;
        }
        last.next = new Node(e,null);
        last = last.next;
        count++;

    }
    //size()
    public int size(){
        return count;
    }
    //isEmpty()
    public boolean isEmpty()
    {
        return size() == 0;
    }
    //peek()
    public Object peek()
    {
        if(isEmpty()) return null;
        return first.element;
    }
    //poll()
    public Object poll()
    {
        if(isEmpty()) return null;
        Object e = first.element;
        first = first.next;
        if(first == null) last = null;
        count--;
        return e;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while(!q.isEmpty())
        {
            System.out.println(q.poll());
        }
    
    }
}
