package final_lly_lize;
// final class using final keyword
final class A
{
    public void display()
    {
        System.out.println("this final class A");
    }
}
//class B extends A // final class cannot be extended
//{
//
//}
public class final_class {
    public static void main(String[] args) {
        new A().display();
    }}
