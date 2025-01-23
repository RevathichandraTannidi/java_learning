package final_lly_lize;
// final with variable
public class final_var {
    public static void main(String[] args) {
        final int a=10;
        int b=20;
        //a++  --> it cannot be sincremented because it was final variable
        System.out.println(a);
            b++;
        System.out.println(b);
    }
}
