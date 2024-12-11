class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}

public class Racecondition1{
    public static void main(String args[]) throws InterruptedException
    {
        Counter c = new Counter();

         Runnable objA = () ->
    {
        for(int i=0;i<1000;i++)
        {
            c.increment();
        }
    };

         Runnable objB = () ->
    {
        for(int i=0;i<1000;i++)
        {
            c.increment();
        }
    };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        

        t1.start();
        t2.start();
        t1.join();
        t2.join();

         System.out.println(c.count);
    }
}
