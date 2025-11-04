package Object_Oriented_Programming.Basic_Topics.Wrapper_Class;

public class Auto_Boxing {
    public static void main(String[] args) {
        int a = 10; //Primitive
        Integer b = a; //Non-Primitive (Auto-Boxing)
        System.out.println("Primitive data: "+a);
        System.out.println("Non-Primitive data(Wrapper): "+b);

        //Before 1.5 version
        int c = 20;
        Integer d = Integer.valueOf(c);  //Boxing
        System.out.println("Primitive data: "+c);
        System.out.println("Non-Primitive data(Wrapper): "+d);

        //Before 9 version
        Integer n = new Integer(30); //Auto-Boxing
        Integer e = 40; //Auto-Boxing
    }
    
}
