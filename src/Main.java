import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ,password and balance ");

        String name=sc.next();
        String password=sc.next();
        double balance= sc.nextDouble();

        SBIUser user=new SBIUser(name,balance,password);

        System.out.println(user.addMoney(100000));

        System.out.println("Enter amount you want to withdraw");
        int  money= sc.nextInt();
        System.out.println("Enter your password ");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        System.out.println(user.calculateInterest(10));
    }
}