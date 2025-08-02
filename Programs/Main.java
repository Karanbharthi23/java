import java.io.*;
import java.lang.*;//for thread
class xyz implements Runnable
{
    public void run()//upar olu runnable impllemnt kru etle run banavi pade
    {
        for(int i =0;i<30;i++)
        System.out.println("Hello World 1");
    }
}
class abc implements Runnable
{
    public void run()
    {
        for(int i =0;i < 20;i++)//loop fervi che ke multi time farse priority process check krshe
        {
            System.out.println("Hello world 2");
        }
    }
}
class Main
{
        public static void main(String[] args)
        {
            /*thread using interrface by @karanbharthi_13*/
            xyz ob=new xyz();
            abc ob1=new abc();//thread ma pass krvva
            //have run metthod call krva pela thread no object bannavo
            Thread t1=new Thread(ob);
            Thread t2=new Thread(ob1);
            t1.start();//oli run vali method call krshe
            t2.start();
        //     /*exception handling by @karanbharthi_13 */
        //    try{
        //     int n=10;
        //      int m=0;
        //     System.out.println(n/m);
        //      }
        //      catch(ArithmeticException e)
        //      {
        //          System.out.println("This is unhandle errorr");
        //      }
        //     finally//@karanbharthi_13
        //     {
        //         System.out.println("Hello world");
        //     }
        }
}
