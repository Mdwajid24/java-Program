class bachlor{
    void crisp()
{
    System.out.println( " my name is khan ");;
}

}
class of extends bachlor{
    void test()
{
    System.out.println( " wajid khan ");;
}

}
class technology extends bachlor {
    void test1()
{
    System.out.println( " zaid khan ");;
}
}
class  hierichial{
 public static void main(String[] args) {
    technology ref1 =new technology();

       ref1.crisp();
       ref1.test1();
 }
}
