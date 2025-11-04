package Object_Oriented_Programming.Basic_Topics.Wrapper_Class.Parse_Method;

public class Example {
    public static void main(String[] args) {
    int n = Integer.parseInt("10");
    double d = Double.parseDouble("5.5");
    boolean b = Boolean.parseBoolean("true");
    long l = Long.parseLong("345210394");
    //int c = Integer.parseInt("SR123"); -->Exception(Number Format Exception)
    System.out.println(n+"\n"+d+"\n"+l);
    }
}
