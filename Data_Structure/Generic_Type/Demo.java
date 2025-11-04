package Data_Structure.Generic_Type;

class ArrayList<E>{
    private Object[] a = new Object[5];
    private int p = 0;

    //Add
    public void add(E e)
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
    public E get(int index)
    {
        if(index <= -1 || index <= size())
        {
            throw new IndexOutOfBoundsException();
        }
        return (E) a[index];
    } 
    //Inserting the element in the array
    public void add(int index,E e)
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

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("java");
        l.add("python");

        String s1 = l.get(0);
        System.out.println(s1);
    }
    
}
