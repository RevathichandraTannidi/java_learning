package Threads;
class thread extends Thread{

    thread(String name) //naming the thread
    {
        super(name);
    }
    public void run()
    {
        for(int i=0; i<5;i++)
        System.out.println("Thread 0"+i);
    }

}
class thread1 extends Thread{
    public void run()
    {
        for(int i=0; i<5;i++)
        System.out.println("Thread 1"+i);
    }

}

class thread2 extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        System.out.println("Thread 2" +i);
    }

}


public class Prior1 {
    public static void main(String[] args) {
        thread t1=new thread("revathi");
        thread1 t2=new thread1();
        thread2 t3=new thread2();

        t2.setName("chandra");
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());

        System.out.println(t2.getName());
        System.out.println(t2.getPriority());

        System.out.println(t3.getName());
        System.out.println(t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(10);
        t3.setPriority(1);
        System.out.println(t1.getName());

        System.out.println(t1.getPriority());


        System.out.println(t2.getName());
        System.out.println(t2.getPriority());

        System.out.println(t3.getName());
        System.out.println(t3.getPriority());
        t1.start();
        t2.start();
        t3.start();


    }
}
