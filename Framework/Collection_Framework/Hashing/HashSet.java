package Framework.Collection_Framework.Hashing;

public class HashSet {
    private Node[] a = new Node[10];
    private int count=0;

    //Adding element
    public boolean add(Object e)
    {
        int hc = Math.abs(e.hashCode());
        int index = hc % a.length;

        if(a[index] == null)
        {
            a[index] = new Node(e,null);
            count++;
            return true;
        }
        Node currentNode = a[index];
        Node prevNode = null;
        while(currentNode != null)
        {
            if(e.equals(currentNode.element)) return false; 
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        prevNode.next = new Node(e,null);
        count++;
        return true;
    }
    //contains()
    public boolean contains(Object e)
    {
        int hc = Math.abs(e.hashCode());
        int index = hc % a.length;
        Node n = a[index];
        while(n != null)
        {
            if(e.equals(n.element)) return true;
            n = n.next;
        }
        return false;
    }
    //remove
    public boolean remove(Object e)
    {
        int hc = Math.abs(e.hashCode());
        int index = hc % a.length;
        Node prevNode = null;
        Node currentNode = a[index];
        while(currentNode != null)
        {
            if(currentNode.element.equals(e)) 
            {
                if(prevNode == null)
                {
                    a[index] = a[index].next;
                    count--;
                    return true;
                }
                prevNode.next = prevNode.next.next;
                count--;
                return true;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }
    //display()
    public void display()
    {
        for(int i=0;i<a.length;i++)
        {
            Node currentNode = a[i];
            while(currentNode != null)
            {
                System.out.println(currentNode.element);
                currentNode = currentNode.next;
            }
        }
    }
}
