abstract class A1
{
    abstract int calc_sum(int x,int y);
    int square(int x)
    {
        return (x*x);
    }
}

class B1 extends  A1
{
    @Override
    int calc_sum(int x, int y) {
        return x+y;
    }
}

public class AbstactClass {
    public static void main(String[] args) {
        B1 obj = new B1();
        System.out.println("Sum is: " + obj.calc_sum(3, 7));

        System.out.println(obj.square(5));

        A1 obj2 = new A1() {
            @Override
            int calc_sum(int x, int y) {
                return x + y + 5;
            }
        };
        System.out.println("New sum is: " + obj2.calc_sum(5, 9));
    }
}
