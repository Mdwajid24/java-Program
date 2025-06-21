import java.util.Scanner ;
public class twoDarray {
    public static void main(String[] args) {
        int sum=0;
        Scanner Twod =new Scanner(System.in);
        System.out.println(" Enter the number of rows :");
        int rows=Twod. nextInt();
        System.out.println("Enter the number of columns :");
        int cols = Twod.nextInt();
        int [][]array= new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element  (" + i + ", " + j + "): ");
                array[i][j] = Twod.nextInt();
            }
        }
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
                sum=sum + array[i][j];
            }   
            System.out.println();
        }
  System.out.println("The sum of array element is "+sum);

    }
}
