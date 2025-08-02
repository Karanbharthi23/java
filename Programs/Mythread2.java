public class Mythread1 extend Thread {
    @Override
    public void run()
    {
    for(int i=0;i<100;i++)
    {
        System.out.println("HELLO KARAN`S WORLD");
    }   
    }
}
public class Mythread2 extend Thread{
    @Override
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("@karanbharthi_13");
        }
    }
}
class Thread_cls
{
    public static void main(String[] args)
    {
                    Mythread1 t1=new Mythread1();
                    Mythread2 t2=new Mythread2();
                    t1.start();
                    t2.start();

    }
}
