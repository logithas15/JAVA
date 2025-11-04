package Object_Oriented_Programming.Basic_Topics.Blocks;

public class Non_static{
    int i;
    {
        System.out.println("Static-Block 1");
        i=10;
    }
    public static void main(String[] args) {
        System.out.println("Main Starts");
        //Object is Created
        Non_static ns = new Non_static();
        System.out.println(ns.i);
        System.out.println("Main Ends");
    }
    {
        System.out.println("Static-Block 2");
        i=30;
    }
    {
        System.out.println("Static-Block 3");
    }

    
}