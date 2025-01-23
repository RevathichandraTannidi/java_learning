package Threads;

public class ex_2 {
    public static void main(String[] args) throws InterruptedException {
        d n=new d();
        n.start();
        d2 n1=new d2();
        for (int i=0;i<10;i++) {
            System.out.println(n.getName());
        }
        Thread n2=new Thread(n1);
        // Runnable interface

        n2.start();
    }
}
