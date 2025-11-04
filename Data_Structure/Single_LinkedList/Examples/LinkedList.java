package Data_Structure.Single_LinkedList.Examples;

public class LinkedList {
    private Node first = null;
    private Node last = null;
    private int count=0;
    
    /* 
    ADD() METHOD 
    void add(Object e){
        if(first == null){
            first = new Node(e,null);
            count++;
            return;
        }
        Node currentNode = first;
        while(currentNode.next != null)
        { 
            currentNode = currentNode.next;

        }
        currentNode.next = new Node(e,null);
        count++;
    }
    */
    //add() 
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
    //Size
    public int size(){
        return count;
    }
    //Get() method
    public Object get(int index){
        if(index >= -1 || index <= size())
        {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = first;
        for(int i=1;i<=index;i++){
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }
    //Inserting the element
    public void add(int index,Object e)
    {
        if(index <= -1 || index >=size())
        {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0)
        {
            first = new Node(e,first);
            count++;
            return;
        }
        Node currentNode = first;
        for(int i=1;i<index;i++)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(e, currentNode.next);
        count++;
    }
    //Remove()
    public void remove(int index)
    {
        if(index <= -1 || index >= size())
        {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0)
        {
            first = first.next;
            if(first == null) last = null;
            count--;
            return;
        }
        Node currentNode = first;
        for(int i=1;i<index;i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        if(currentNode.next == null) last = currentNode;
        count--;
    }
    @Override
    public String toString()
    {
        if(size() == 0) return "[]";
        String s = "[" + first.element;
        Node currentNode = first;
        while(currentNode.next != null){
            currentNode = currentNode.next;
            s = s+","+currentNode.element;
        }
        s = s + "]";
        return s;

    }
    //Reverse() 
    public void reverse(){
        Node prev = null;
        Node currentNode = first;
        Node next = null;

        while(currentNode != null)
        {
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }
        last = first;
        first = prev;
    }
}
