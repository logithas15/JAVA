import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("main starts");
        try{
            m1();
        }catch(Exception e){
            System.out.println("Handled");
        }
        System.out.println("main ends");
    }
    public static void m1() throws Exception{
        m2();
    }
    public static void m2() throws FileNotFoundException,IOException{
        FileReader r = new FileReader("C:\\Users\\logit\\Desktop\\JAVA\\Basic_Programs\\Basics\\automorphic.java");
        System.out.println("Reading data");
        FileWriter w = new FileWriter("C:\\Users\\logit\\Desktop\\JAVA\\Basic_Programs\\Basics\\automorphic.java");
        System.out.println("Writing data");
    }
}
