import java.util.*;

public class ThreadWtnNot{

     public static void main(String []args){
       pc p = new pc();
       
       Thread t1 = new Thread(new Runnable(){
           @Override
           public void run()
           {
               p.produce();
           }
       });
       
       Thread t2 = new Thread(new Runnable(){
           @Override
           public void run()
           {
               p.consume();
           }
       });
       
        t1.start();
		t2.start();
    try
    {
        t1.join();
		t2.join();
    }
    catch(Exception E)
    {
        //
    }
     }

   
    
}


class pc 
{
    
    public void produce()
    {
        synchronized(this)
        {
           try
           {
                System.out.println("producer thread running");
				wait();
				System.out.println("producer thread resumed");
           }
           catch(Exception E)
           {}
        }
    }
    
    public void consume()
    {
        try
        {
            Scanner s = new Scanner(System.in);
			Thread.sleep(1000);
			synchronized(this)
        {
            System.out.println("reading line.");
            s.nextLine();
             System.out.println("line is read");
            notify();
        }
        }
        catch(Exception E)
        {}       
    }
}