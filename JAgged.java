public class JAgged {
    public static void main(String[] args) {
        int a[][][] = { { { 10, 20, 30, 03 } }, { { 50, 60, 70 }, { 80, 90 } }, { { 1, 2, 3, 4, 5 } } };
        System.out.println( "here are the list ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    System.out.print(" " +a[i][j][k]);
                }
            }
        }
        
    }
}
