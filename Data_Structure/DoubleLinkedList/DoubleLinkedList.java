package Data_Structure.DoubleLinkedList;

public class DoubleLinkedList {
    private Node first;
    private Node last;
    private int count;

    //Add()
    public void add(Object e)
    {
        if(first == null)
        {
            first = new Node(e);
            last = first;
            count++;
            return;
        }
        last.next = new Node(e, null,last);
        last = last.next;
        count++;

    }
    //inserting the element
    public void add(int index,Object e)
    {
        if(index <= -1 || index >= size())
        {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0)
        {
            Node n = new Node(e,first,null);
            first.previous = n;
            first = n;
            count++;
            return;
        }
        Node currentNode = first;
        for(int i=1 ;i<index;i++)
        {
            currentNode = currentNode.next;
        }
        Node n = new Node(e,currentNode.next,currentNode);
        currentNode.next.previous = n;
        currentNode.next = n;
        count++;
    }
    //size()
    public int size(){
        return count;
    }
    //remove()
    public void remove(int index)
    {
        if(index <= -1 || index >= size())
        {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0)
        {
            first = first.next;
            if(first != null)
            {
                first.previous = null;
            }
            else
            {
                last = null;
            }
            count--;
            return;
        }
        Node currentNode = first;
        for(int i=1;i<index;i++)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        if(currentNode.next != null)
        {
            currentNode.next.previous = currentNode;
        }
        else{
            last = currentNode;
        }
        count--;
    }
    @Override
    public String toString()
    {
        if(size() == 0) return "[]";
        String s = "[" + first.element;
        Node currentNode = first;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
            s = s+","+currentNode.element;
        }
        s = s+"]";
        return s;
    }

}
