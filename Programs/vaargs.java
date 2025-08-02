//import java.lang.io.*;
class vaargs 
{
    public static void fun(String.../*elips */var)
    {
        for(String val : var)
        {
            System.out.println("This is value of "+ val);
        }
    }
    public static void main(String []args)
    {
        vaargs ob=new vaargs();
        ob.fun("karan","goswami");
        ob.fun("karan","ARVINDBHATHI","GOSWAMI");
        ob.fun();
    }
}