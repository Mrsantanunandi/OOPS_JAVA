package Day_4;

class Outer2 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class InnerClass2 {
                void display() {
                    System.out.println("Display: Outer_x is : " + outer_x);
                }
            }
            InnerClass2 innerobj = new InnerClass2();
            innerobj.display();
        }
    }
}

public class prac3 {
    public static void main(String[] args) {
        Outer2 obj1 = new Outer2();
        obj1.test();
    }
}
