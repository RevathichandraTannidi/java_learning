package multithreading;

public class Demo implements Runnable{
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName()+" entered");
        show();
        System.out.println(Thread.currentThread().getName()+" leaving...");
    }
    public void show()
    {

    }
}
