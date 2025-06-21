class multisuper {
    int a = 500, b = 30, c;

    void sum() {
        c = a + b;
        System.out.println("The sum of a & b is " + c);
    }
}
    class subtract extends multisuper {
        void sub() {
            c = a - b;
            System.out.println(" The subtraction of to number is  " + c);
        }
    }

    class multiple extends subtract {
        void mul() {
            c=a*b;
            System.out.println(" The multiple of a and b is "+c);

        }
    }
    public class multi$uper{
        public static void main(String[] args) {
         multiple sc=new multiple();
            sc.sum();
            sc.sub();
            sc.mul();

        }
    }


