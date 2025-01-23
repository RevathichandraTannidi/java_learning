package Threads;

public class dead {


        public static void main(String[] args) {

            try {

                System.out.println("Entering into Deadlock");

                // Joining the current thread
                Thread.currentThread().join(); //join is to execute when the current execuion is dead after that next will be printed

                // This statement will never execute
                System.out.println("This statement will never execute");
            }

            // Catch block to handle the exceptions
            catch (InterruptedException e) {


                e.printStackTrace();
            }
        }
    }

