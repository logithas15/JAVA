package Object_Oriented_Programming.Basic_Topics.Single_Ton_class;

class Theater{
    int seats = 100;
    private static Theater t;
    private Theater(){}

    public void BookTicket (int n){
        if(n>seats){
            System.out.println(n+" seats is not availabe");
            return;
        }
        seats -= n;
        System.out.println(n+ " seats is available");
        System.out.println(seats+ " is available");
    }
    public static Theater get(){
        if(t==null){
            t = new Theater();
            return t;
        }
        return t;
    }
}
public class Example {
    public static void main(String[] args) {
        Theater user1 = Theater.get();
        Theater user2 = Theater.get();
        Theater user3 = Theater.get();

        user1.BookTicket(60);
        user1.BookTicket(40);
        user1.BookTicket(20);
    }
}
