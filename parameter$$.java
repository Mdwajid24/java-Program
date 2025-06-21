class para {
    String a;
    int b;

    para(String username, int age) {
        a = username;
        b = age;
    }
    para(int ad, int flat) {
        System.out.println(ad +" "+flat); 
    }
void disp(){
    System.out.println(a+"   "+b);
    
}
}

public class parameter$$ {
    public static void main(String[] args) {
   para sc =new para ( "wajid", 21 );
   para bc = new para(39, 03);
    sc.disp();
    }

}
