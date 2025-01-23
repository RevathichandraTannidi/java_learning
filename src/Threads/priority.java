package Threads;
class priotyu extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
            System.out.println("Thread :"+i);
    }
}

public class priority {
    public static void main(String[] args) {
        priotyu p=new priotyu();
        Thread t=new Thread(p);
        Thread t1=new Thread(p);
        t.setDaemon(true);
        t.start();
        System.out.println(t.isDaemon());
        t1.start();
        System.out.println(t.getPriority());
        System.out.println(Thread.currentThread().isDaemon());

    }
}
