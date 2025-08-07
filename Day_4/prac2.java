package Day_4;

class Outer1 {
    int outer_x = 100;

    void test() {
        InnerClass1 innerobj = new InnerClass1();
        innerobj.display();
    }

    class InnerClass1 {
        int y=7;
        void display() {
            System.out.println("Display: Outer_x is : " + outer_x);
        }
    }
    void printY()
    {
        System.out.println(y);
    }
}

public class prac2 {
    public static void main(String[] args) {
        Outer1 obj1 = new Outer1();
        obj1.test();
    }
}
