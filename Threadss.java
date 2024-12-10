package Threads;
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();;
            }
        }
    }
}

class B extends Thread
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

public class Threadss {
    public static void main(String args[])
    {
        A objA = new A();
        B objB = new B();

        objA.start();
        objB.start();

    }
    
}
