import java.lang.*;
class fun
{
        private int s1;
        private int s2;
       // private int s3;
        public fun()
        {
            System.out.println("hello");
        }
        public fun(int a)
        {
            s1=a;
            System.out.println("a value is "+s1);
        }
        public fun(int a,int b)
        {
            s1=a;
            s2=b;
            System.out.println("a and b value is "+s1+s2);
        }
}
class main_cls
{
    public static void main(String[] args)
    {
        fun obj1=new fun();
        fun obj2=new fun(10,20);
        fun obj3=new fun(10);
        
    }
}