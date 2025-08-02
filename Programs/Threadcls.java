import java.util.*;
class Mythread1 extends Thread//thread class extend kravyo
 {
    @Override//thread overide kravyyo
    public void run()//run method banavi compulsary chhe
    {
    for(int i=0;i<100;i++)
    {
        System.out.println("HELLO KARAN`S WORLD");
    }   
    }
}
class Mythread2 extends Thread//again upar ni jem
{
    @Override
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("@karanbharthi_13");
        }
    }
}
class Threadcls
{
    public static void main(String[] args) 
    {
                    //@karanbharthi_13
                    Mythread1 t1=new Mythread1();//class nu thread che to khali extend thi thay jase
                    Mythread2 t2=new Mythread2();//last prg  ni jem alag nai banavo pade
                    t1.start();//ahiya run method call kravi chhe
                    t2.start();//ahiya biji run method call kri che

    }
}
