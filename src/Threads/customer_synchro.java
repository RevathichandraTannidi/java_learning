package Threads;
class bank
{
    int amount=10000;
    public  synchronized void withdraw(int amount)
{
    System.out.println("Going to withdraw :" +amount);
    if(this.amount<amount)
    {
        try
        {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    this.amount-=amount;

    System.out.println("sucessfully with draw transaction completed");
}
public synchronized void deposit(int amount)
{
    System.out.println("going to deposit :" +amount);
    this.amount+=amount;

    System.out.println("sucessfully deposited transaction completed");
    notify();
}
public synchronized  void balance()
{
    System.out.println(this.amount);
}
}

public class customer_synchro {
    public static void main(String[] args) {
        bank b=new bank();
        new Thread()
        {
            public void run()
            {
                b.withdraw(100);
                b.deposit(1500);
                b.balance();
            }
        }.start();


        new Thread()
        {
            public void run()
            {
                b.withdraw(140);
                b.deposit(1900);
                b.balance();
            }
        }.start();
    }
}
