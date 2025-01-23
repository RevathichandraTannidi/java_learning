package final_lly_lize;
// final with method
class book
{
    public final void  author()
    {
        System.out.println("ravindra ");
    }
}
class digital extends book{
    public void phone()
    {
        System.out.println("my phone is vivo 1901");
    }
    // we cannot override the final method
//    public void author()
//    {
//        System.out.println("ramu");
//    }
}
public class final_metho  {
    public static void main(String[] args) {
        digital d=new digital();
        d.phone();
        d.author();
    }
}
