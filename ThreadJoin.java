public class ThreadJoin{

     public static void main(String []args){
        System.out.println("Hello World");
        
        myThread t1 = new myThread();
        t1.start();
        try{
            t1.join(1000);
        }
        catch(Exception E)
        {
            
        }
        
        System.out.println("main thread waited for 1000ms. thread:" + Thread.currentThread().getName());
        System.out.println("child thread alive:" + t1.isAlive());
        
     }
}

class myThread extends Thread
{
    
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("currently execting thread:" + t.getName());
        System.out.println("currently execting thread:" + t.isAlive());
    }
}