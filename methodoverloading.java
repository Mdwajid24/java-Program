  public class methodoverloading {
    void time (){   
        int a = 10;
        int b=20;
        int c=a+b;
        System.out.println("the sum of a and b is "+c); 
    }
    void time ( int x, int y){ 
        int c =x+y;
        System.out.println("the sum is "+c);   
    }
    void time  (int z, double a){    
         double g =z+a;   
         System.out.println("the sum is "+g);
    }
    public static void main(String[] args) {
        methodoverloading sc= new methodoverloading();
        sc.time();
        sc.time( 54,56);
        sc.time( 44,457.90);
    }
}
 