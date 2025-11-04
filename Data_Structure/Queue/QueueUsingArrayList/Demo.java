package Data_Structure.Queue.QueueUsingArrayList;

class QueueArraylist {
    private Object[] a = new Object[5];
    private int p=0;
    //Add
    public void add(Object e)
    {
        if(p>=a.length) increaseArray();
        a[p++] = e;
    }
    //Increase Array length
    private void increaseArray(){
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
        return a[0];
    }
    //poll
    public Object poll()
    {
        if(isEmpty()) return null;
        Object e = a[0];
        for(int i=1;i<=size();i++)
        {
            a[i-1] = a[i];
        }
        a[--p]=null;
        return e;
    }


}
public class Demo{
    public static void main(String[] args) {
        QueueArraylist q = new QueueArraylist();
        q.add(10);
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
