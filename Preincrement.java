import java.util.Scanner;

public class Preincrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter the value of a : ");
        a = sc.nextInt();
        System.out.println(" pre_increment value is " +a);
        System.out.println(" pre_increment value is " + ++a);//10 ---> 11
        System.out.println(" post_increment value is " + a++);//11
        System.out.println(" pre_increment value is " +a);//12
        System.out.println("enter the value of b : ");
        
        b= sc.nextInt();
        System.out.println(" pre_increment value is " + --b);//11
        System.out.println(" pre_increment value is " +b--);//11
        System.out.println(" pre_increment value is " +b);//10
        
    }
}
