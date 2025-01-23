package superkey;


class A
{
    void print()
    {
        System.out.println("im the A in the class A");
    }

}
class B extends A
{
   void print()
   {
       super.print();
       System.out.println(" Im  the B in the class B");

   }
}

public class Superwtihmethods {
    public static void main(String[] args) {
        B b=new B();
        b.print();

    }
}
