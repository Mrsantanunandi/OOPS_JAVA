class X
{
    void display()
    {
        System.out.println("This is from class X");
    }
}

class Y extends  X
{
    @Override
    void display()
    {
        System.out.println("This is from class Y");
    }
}

class Z extends Y
{
    @Override
    void display()
    {
        System.out.println("This is from class Z");
    }
}

public class DynamicMethodDispatch {
    public  static void  main(String[] args)
    {
        X ref;
        ref=new X();
        ref.display();
        ref=new Y();
        ref.display();
        ref=new Z();
        ref.display();
    }
}
