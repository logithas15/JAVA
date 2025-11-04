package Data_Structure.Stack.StackUsingArrayList;

class StackArrayList{
    private Object[] a = new Object[5];
    private int p=0;

    //add
    public void push(Object e)
    {
        if(p>=a.length) increaseArray();
        a[p++] = e;
    }
    //Increase Array length
    private void increaseArray()
    {
        Object[] temp = new Object[a.length+3];
        for(int i=0;i<a.length;i++)
        {
             temp[i] = a[i];
        }
        a=temp;
    }

    //size()
    public int size()
    {
        return p;
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
        return a[p-1];
    }
    //pop
    public Object pop()
    {
        if(isEmpty()) return null;
        Object e = a[--p];
        a[p] = null;
        return e;
    }
}
public class Demo {
    public static void main(String[] args) {
        StackArrayList s = new StackArrayList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s.pop());
    }
    
}
