class A
{
    void display()
    {
        System.out.println("This is from Class A");
    }
}
class  B extends  A
{
    @Override
    void display() {
        System.out.println("This is from class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args)
    {
        A obj=new A();
        obj.display();
        B obj1=new B();
        obj1.display();
    }
}
