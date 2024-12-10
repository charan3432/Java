package Threads;
class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hii");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();;
            }
        }
    }
}

class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();;
            }
            
        }
    }
}

public class Runnablle {
    public static void main(String args[])
    {
        Runnable objA = new A();
        Runnable objB = new B();

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);


        t1.start();
        try{
            Thread.sleep(6);
        }catch(Exception e){
            e.printStackTrace();
        }
        t2.start();

    }
    
}
