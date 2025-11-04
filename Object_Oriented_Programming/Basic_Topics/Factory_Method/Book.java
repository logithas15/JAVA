package Object_Oriented_Programming.Basic_Topics.Factory_Method;

import java.util.Scanner;

public class Book {
    String name ;
    String author;
    Double price;

    public static Book getBook(){
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Book Details");
        b.name = sc.nextLine();
        b.author = sc.nextLine();
        b.price = sc.nextDouble();
        return b;
    }
    public static void main(String[] args) {
        Book b = getBook();
        System.out.println(b.name+"\n"+b.author+"\n"+b.price);
    }

    
}
