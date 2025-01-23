package final_lly_lize;

public class finally_block {
    public static void main(String[] args) {
        try
        {
            int a=10/0;
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("number format");
        }
        finally {
            System.out.println("it is the block executed in finally");
        }
    }
}
