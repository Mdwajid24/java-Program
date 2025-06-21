import java.util.Scanner;
public class switchstatement {
    public static void main(String[] args) {
        int a ,b,c;
        System.out.println("Enter the value to find the switch in between 1 to 5");
        Scanner sc =new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the value  of b");
         Scanner mc=new Scanner(System.in);
         b= mc.nextInt(); 
        System.out.println("Enter the value  of c");
        Scanner bc =new Scanner(System.in);
        c = bc.nextInt();
    
    switch (a) {
        case 1:
            System.out.println("the adding to number "+(b+c));
            break;
        case 2:
            System.out.println( "The subtracting the value of "+(b-c));
            break;
        case 3:
            System.out.println("First adding two number and then multipling  by second number  "+((b+c)*c));
            break;
        case 4:
            System.out.println( " this File is empty ");
            break;
        case 5:
            System.out.println(" 404 Error");
            break;
        default:
        System.out.println(" you enter invalid number ");
        break;
    }

    }
}
