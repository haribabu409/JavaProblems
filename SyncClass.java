public class SyncClass{

     public static void main(String []args){
         Sender s = new Sender();
         SenderThread t1 = new SenderThread("how are you?", s);
         SenderThread t2 = new SenderThread("Good then!", s);
         try{
              t1.start();
             //t1.join();
             t2.start();
             //t2.join();
         }
         catch(Exception E)
         {
             
         }
     }
}

class Sender 
{
    
    public void sendMessage(String msg)
    {
       System.out.println("Sending message: " + msg);
       try
       {
           Thread.sleep(1000);
       }
       catch(InterruptedException e)
       {
           //
       }
       System.out.println("message sent:" + msg);
    }
}

class SenderThread extends Thread
{
    Sender s;
    String msg;
    
    SenderThread(String msg, Sender s)
    {
        this.s = s;
        this.msg = msg;
    }
    
    public void run()
    {
        synchronized(s)
        {
            s.sendMessage(msg);
        }
    }
    
}