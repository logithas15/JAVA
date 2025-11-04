package Data_Structure.DoubleLinkedList;

public class Node {
    Object element;
    Node next;
    Node previous;

    public Node(Object e)
    {
        element = e;
        next = null;
        previous = null;
    }
    public Node(Object e, Node n,Node p){
        element = e;
        next = n;
        previous = p;
    } 
}
