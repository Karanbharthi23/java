interface name
{
    public void fun();
}
interface id
{
    public void fun_id();
}
class xyz implements name,id
{
    @Override
    public void fun()
    {
        System.out.println("e sala kap namde - virat kohli");
    }
    @Override
    public void fun_id()
    {
        System.out.println("18");
    }
}
class multi
{
    public static void main(String[]args)
    {
        xyz obj=new xyz();
        obj.fun();
        obj.fun_id();
    }
}