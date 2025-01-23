package final_lly_lize;

public class finalize_key {

        public static void main(String[] args)
        {
            finalize_key m = new finalize_key();

            // Calling finalize method Explicitly.
            m.finalize();
            m.finalize();
            m = null;

            // Requesting JVM to call Garbage Collector method
            System.gc();
            System.out.println("Main Completes");
        }

        // Here overriding finalize method
        public void finalize()
        {
            System.out.println("finalize method overridden");
        }

}
