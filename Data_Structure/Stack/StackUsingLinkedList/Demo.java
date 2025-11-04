package Data_Structure.Stack.StackUsingLinkedList;

class StackLinkedList{
    private Node first = null;
    private Node last = null;
    private int count=0;

    //add
    public void push(Object e)
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
    public int size()
    {
        return count;
    }
    //isEmpty
    public boolean isEmpty()
    {
        return size() == 0;
    }
    //peek
    public Object peek()
    {
        if(isEmpty()) return null;
        return first.element;
    }
    //pop
    public Object pop()
    {
        if(isEmpty()) return null;
        Object e = first.element;
        if(first == null) last = null;
        count--;
        return e;
    }
}
public class Demo {
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
    }
}
