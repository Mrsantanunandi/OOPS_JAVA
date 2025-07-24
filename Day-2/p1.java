import java.util.*;

class Box {
    int height;
    int width, depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int area() {
        return 2 * (height * width + width * depth + depth * height);
    }

    public int volume() {
        return height * width * depth;
    }
}

public class p1 {

    public static void main(String[] args) {
        int h, l, w;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        h = sc.nextInt();
        System.out.print("Enter Depth: ");
        l = sc.nextInt();
        System.out.print("Enter Width: ");
        w = sc.nextInt();

        Box obj = new Box(h, w, l);
        int area = obj.area();
        int vol = obj.volume();
        System.out.println("Area is: " + area);
        System.out.println("Volume is : " + vol);
        sc.close();
    }
}