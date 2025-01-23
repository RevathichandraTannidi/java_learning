package Threads;

class demo extends Thread
{
    public void run()
    {
        for(int i=0;i<20;i++)
        System.out.println("book");
    }
}
class demo1 extends Thread{
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println("hey");

        }

    }
}

public class ex_1 {
    public static void main(String[] args) {
        demo1 d1=new demo1();
        demo d =new demo();
        d.start();
        System.out.println(  d.getName());
        d1.start();
        System.out.println(d1.getName());
        System.out.println(d.isAlive());


    }
}
