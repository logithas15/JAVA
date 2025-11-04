package Object_Oriented_Programming.Basic_Topics.Wrapper_Class;

public class Auto_Unboxing {
    public static void main(String[] args) {
        Integer a = 10;
        int b = a;
        System.out.println("Non-Primitive(Wrapper): "+a);
        System.out.println("Primitive: "+b);

        //Before 1.5 version
        Integer c = 20;
        int d = c.intValue();
        System.out.println("Non-Primitive(Wrapper): "+c);
        System.out.println("Primitive: "+d);

        //Before 9 version
        int n = new Integer(30);
    }
}
