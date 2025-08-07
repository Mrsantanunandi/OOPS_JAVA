package Day_4;

class Outer {
    int outer_x = 100;

    void test() {
        InnerClass innerobj = new InnerClass();
        innerobj.display();
    }

    class InnerClass {

        void display() {
            System.out.println("Display: Outer_x is : " + outer_x);
        }
    }
}

public class Prac1 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.test();
    }
}
