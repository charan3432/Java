// class A implements Runnable
// {
//     public void run()
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("Hii Charan");
//             try{
//                 Thread.sleep(10);
//             }catch(Exception e){
//                 e.printStackTrace();;
//             }
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run()
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("Hello Charan");
//             try{
//                 Thread.sleep(10);
//             }catch(Exception e){
//                 e.printStackTrace();;
//             }
            
//         }
//     }
// }


public class Runnablewithanonymous {
    public static void main(String args[])
    {
        Runnable objA = () ->
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hii Charan");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();;
            }
        }
    };
        Runnable objB = () ->
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello Charan");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();;
            }
            
        }
    };

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