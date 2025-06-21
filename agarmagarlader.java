import java.util.Scanner;

public class agarmagarlader
{
     public static void main(String[] args) 
    {
        int marks;
        System.out.println("Enter the marks of the student: ");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        {
            if (marks > 90 && marks < 100) 
            {
                System.out.println("Your grade is O");
            } else if (marks > 80) 
            {
                System.out.println("Your grade is E");
            } else if (marks >= 70)
            {
                System.out.println("Your grade is A");
            } else if (marks > 50) 
            {
                System.out.println("Your grade is C");
            } else if (marks > 40) 
            {
                System.out.println("Your grade is D");
            } else 
            {
                System.out.println("you are failed  your grade is F");
            }
        }
    }
}