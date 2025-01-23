package multithreading;

public class MainDemo {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Thread t1=new Thread(d1);
        Thread t2=new Thread(d1);
        Thread t3=new Thread(d1);
        Thread t4=new Thread(d1);
        t1.start();
        t2.start();
        t3.start();

    }
}
