class abc
{//this is intant intialise block
        {//auto matic call first
            System.out.println("Hello iib");
        }
        public abc()
        {//this is construcro aana krta vadhare priority iib ni chhe
            System.out.println("this is constructor");
        }
}


class iib
{
    public static void main(String[] args)
    {//call krva iib and constructor
        abc obj=new abc();
        abc obj1=new abc();
    }
}