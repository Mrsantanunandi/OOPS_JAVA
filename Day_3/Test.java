package Day_3;

class Tdemo {
    int a, b;

    public Tdemo(int i, int j) {
        a = i;
        b = j;
    }

    boolean equal(Tdemo obj) {
        if (a == obj.a && b == obj.b) {
            return true;
        } else {
            return false;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Tdemo obj1 = new Tdemo(5, 7);
        Tdemo obj2 = new Tdemo(5, 7);
        Tdemo obj3 = new Tdemo(10, 20);

        System.out.println("ob1==ob2" + " : " + obj1.equal(obj2));
        System.out.println("ob1==ob3" + " : " + obj1.equal(obj3));
    }

}
