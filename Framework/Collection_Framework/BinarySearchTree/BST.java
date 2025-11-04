package Framework.Collection_Framework.BinarySearchTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BST {
    Node root;
    int count = 0;
    boolean flag = true;
    
    //Adding 
    public boolean add(int key)
    {
        root = add(key,root);
        return flag;
    }
    public Node add(int key,Node n)
    {
        if(n==null){
            n = new Node(key);
            count++;
            return n;
        }
        if(key < n.key)
        n.left = add(key,n.left);
        else if(key > n.key)
        n.right = add(key,n.right);
        else{
            flag = false;
        }
        
        return n;
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
    //Depth First Order
    public void preOrder()
    {
        preOrder(root);
    }
    public void postOrder()
    {
        postOrder(root);
    }
    public void inOrder()
    {
        inOrder(root);
    }
    //PreOrder
    public void preOrder(Node n)
    {
        System.out.println(n.key);
        preOrder(n.left);
        preOrder(n.right);
    }
    //PostOrder
    public void postOrder(Node n)
    {
        postOrder(n.left);
        postOrder(n.right);
        System.out.println(n.key);
    }
    //InOrder
    public void inOrder(Node n)
    {
        inOrder(n.left);
        System.out.println(n.key);
        inOrder(n.right);
    }
    
    //Breadth First Order
    //Level Order Traversal
    public void LOT(){
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(root);

        while(! q.isEmpty())
        {
            Node n = q.poll();
            System.out.println(n.key+"");
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }
    }

    //remove()
    public void remove(int key)
    {
        remove(key,root);
    }
    public Node remove(int key,Node n)
    {
        if(n == null) return null;
        if(key < n.key)
        n.left = remove(key,n.left);
        else if(key > n.key)
        n.right = remove(key,n.right);
        else{
            if(n.left == null){
                count--;
                return n.right;
            }
            else if(n.right == null)
            {
                count--;
                return n.left;
            }
            else 
            {
                n.key = minElement(n.right);
                n.right = remove(n.key,n.right);
            }
        }
        return n;
    }
    //Getting min Element from right side
    public int minElement(Node n)
    {
        int min = n.key;
        while(n.left != null)
        {
            min = n.left.key;
            n = n.left;
        }
        return min;
    }
}
