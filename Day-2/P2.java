import java.util.*;

class Box1 {
    int height;
    int width, depth;

    public Box1(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // public Box1() {
    // this.height = 0;
    // this.width = 0;
    // this.depth = 0;
    // }

    public Box1(int h) {
        this.height = h;
        this.depth = h;
        this.width = h;
    }

    public int area() {
        return 2 * (height * width + width * depth + depth * height);
    }

    public int volume() {
        return height * width * depth;
    }
}

public class P2 {

    public static void main(String[] args) {
        int h, l, w;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        h = sc.nextInt();
        System.out.print("Enter Depth: ");
        l = sc.nextInt();
        System.out.print("Enter Width: ");
        w = sc.nextInt();

        Box1 obj = new Box1(h, w, l);
        int area = obj.area();
        int vol = obj.volume();
        System.out.println("Area is: " + area);
        System.out.println("Volume is : " + vol);

        Box1 obj1 = new Box1();
        int area1 = obj1.area();
        int vol1 = obj1.volume();
        System.out.println("Area is: " + area1);
        System.out.println("Volume is : " + vol1);

        Box1 obj2 = new Box1(h, w, l);
        int area2 = obj2.area();
        int vol2 = obj2.volume();
        System.out.println("Area is: " + area2);
        System.out.println("Volume is : " + vol2);

        sc.close();
    }
}