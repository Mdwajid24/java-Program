import java.util.Scanner;

public class agarmagar {
  public static void main(String[] args) {

    System.out.println("Enter the age: ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
     System.out.println("Enter the date  on the day you birth  ");
      int date=sc.nextInt();
      {
      if (age>18)
      {
      System.out.println("eligible for vote");
      }
      else{
      System.out.println("not eligible for vote");
      }
      }
    
    

  }
}
