package Data_Structure.ArrayList;

public class ArrayList {
    private Object[] a = new Object[5];
    private int p = 0;

    //Adding the elements 
    public void add(Object e)
    {
        if(p >= a.length) increaseArray();
        a[p++] = e;
    }
    //IncreaseArray()
    public void increaseArray()
    {
        Object[] temp = new Object[a.length+3];
        for(int i=0;i<a.length;i++)
        {
            temp[i] = a[i];
        }
        a = temp;
    }
    //Size
    public int size()
    {
        return p;
    }
    //Get the element in the array
    public Object get(int index)
    {
        if(index <= -1 || index <= size())
        {
            throw new IndexOutOfBoundsException();
        }
        return a[index];
    } 
    //Inserting the element in the array
    public void add(int index,Object e)
    {
        if(index <= -1 || index <= size())
        {
            throw new IndexOutOfBoundsException();
        }
        for(int i = size()-1; i>=index;i--)
        {
            a[i+1] = a[i];
        }
        a[index] = e;
        p++;
    }
    //Remove the element in the array(Shifting)
    public void remove(int index)
    {
        if(index <= -1 || index >= size())
        {
            throw new IndexOutOfBoundsException();
        }
        for(int i=index+1;i<size();i++)
        {
            a[i-1] = a[i];
        }
        a[--p] = null;
    }
    //toString()
    public String toString()
    {
        if(size() == 0) return "[]";
        String s = "["+a[0];
        for(int i=1;i<size();i++)
        {
            s = s+","+a[i];
        }
        s = s+"]";
        return s;
    }
}
