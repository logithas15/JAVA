package Object_Oriented_Programming.Basic_Topics.Blocks;

public class Static_Blocks {
    static int i;
    static{
        System.out.println("Static-Block 1");
        i=10;
    }
    public static void main(String[] args) {
        System.out.println("Main Starts");
        System.out.println(i);
        System.out.println("Main Ends");
    }
    static {
        System.out.println("Static-Block 2");
        i=30;
    }
    static {
        System.out.println("Static-Block 3");
    }
}
