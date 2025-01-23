package superkey;
//super with variables

 class bag
 {
     int rows=3;
 }
 class books extends bag
 {
     int rows =2;
     void display()
     {
         System.out.println("no.of rows for the books is:"+super.rows);
         System.out.println("no. of  small rows in a bag :" + rows);
         System.out.println("total no.of rows in a bag :" + (super.rows + rows));
     }
 }
public class supervariables {
    public static void main(String[] args) {
        System.out.println("brief about the school bag");
        books b=new books();
        b.display();

    }
}
