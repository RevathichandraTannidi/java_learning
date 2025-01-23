package Threads;

class multidemo implements Runnable{
     String name;
     multidemo(String name1)
     {
         name=name1;
     }

    @Override
    public void run() {
        for (int i=0;i<=10;i++)
        {
            try {
                Thread.sleep(100);
                
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(name+":"+i);
        }
    }
}

public class join  {
    public static void main(String[] args) throws InterruptedException {
        multidemo m1=new multidemo("Thread 1");
        multidemo m2=new multidemo("Thread 2");

        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        t1.start();
        t1.join();
        t2.start();

    }
}
