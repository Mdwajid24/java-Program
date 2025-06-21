class  check
{
void show()
{
    System.out.print("red");
}
}
class result extends check
{    
 
      @Override 
      void show() 
      {
        super.show();
         System.out.print("blue");  
     }

}
 class methodoverriding {
    public static void main(String args[]) {
        result sc = new result();
        sc.show();
    }
}
