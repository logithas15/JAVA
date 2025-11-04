package Data_Structure.Single_LinkedList.Examples;

public class Demo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);

        for(int i=0;i<l.size();i++)
        {
            System.out.println((Integer)l.get(i));
        }
    }
    
}
