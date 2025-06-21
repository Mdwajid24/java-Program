import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner pc = new Scanner(System.in);
        System.out.println(" Enter the number ");
        n = pc.nextInt();
        if (n % 2 == 0) {
            for (i = 0; i < n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println("The sum even number :" + sum);
        }

        else {
            for (i = 0; i < n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println("The sum odd number :" + sum);
        }

    }
}
